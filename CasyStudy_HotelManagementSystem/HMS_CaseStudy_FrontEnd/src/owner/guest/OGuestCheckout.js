import React from 'react'
import OwnerGuestNavBar from './OwnerGuestNavBar';
import { useState } from 'react';
import axios from 'axios';


function OGuestCheckout() {
    const[message,setMessage]=useState(null);
    const[guest,setGuest]=useState({        
        guestCode_:"",    
    })
    const[data,setData]=useState({        
        todayDate_:"",
        reservationCode:"",
        name_:"",
        phoneNumber_:"",
        emailId_:"",
        gender_:"",
        address_:"",
        company_:"",        
        guestCode_:"",    
        roomNumber:"",
        numberOfAdult:"",  
        numberOfChildren:"",
        checkIn:"",
        checkOut:"",
        numberOfNights:"",
        guestStatus_:""
    })
    axios.interceptors.request.use(
        config => {
        config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
        return config;
        },
        error => {
        return Promise.reject(error);
        });
    
    const idurl="Owner/owner/guest/getguestbyid?guestCode="+guest.guestCode_;

    function guestsubmit(i){
        i.preventDefault(); 
        axios.get(idurl)
            .then(res=>{
                setData(res.data);
            },
            );
        
    }
    
    const url="Owner/owner/guest/checkoutguest?guestCode=" + guest.guestCode_;
    function submit(e){
        e.preventDefault();
        axios.put(url)
            .then(res=>{
                setMessage("Guest Checked Out");
                setTimeout(function(){window.location.reload()},900)
            },
           );
        
    }
    
    function guesthandle(i){
        const newdata={...guest}
        newdata[i.target.id]=i.target.value
        setGuest(newdata)
    }
    
    return (
    <React.Fragment> 
        <OwnerGuestNavBar/>
        <div className='backimage'>
                <div  className="reservesearchbar">
                    <form onSubmit={(i)=>guestsubmit(i)}> 
                        <input className='idsearch' onChange={(i)=>guesthandle(i)} id="guestCode_" value={guest.guestCode_} placeholder='Guest Code' type="text"/>
                        <button  className='idsearchbutton'>search</button>
                    </form>
                </div>
                <div className='updatebody'>  
                <div className="container">
                <div className="title">New Guest</div>
                <div  className='content'> 
                <div> 
                    <form onSubmit={(e)=>submit(e)}>
                    <div className="user-details"> 
                            <div className="input-box"><input readOnly value={data.guestCode_} placeholder='Guest Code' type="text"/></div>
                            <div className="input-box"><input readOnly value={data.name_} placeholder='name' type="text"/></div>
                            <div className="input-box"><input readOnly value={data.phoneNumber_} placeholder='phoneNumber' type="text"/></div>
                            <div className="input-box"><input readOnly value={data.emailId_} placeholder='emailId' type="email"/></div>
                            <div className="input-box"><input readOnly value={data.address_} placeholder='address' type="text"/></div>
                            <div className="input-box"><input readOnly value={data.numberOfAdult} placeholder='numberOfAdult' type="number"/></div>
                            <div className="input-box"><input readOnly value={data.numberOfChildren} placeholder='numberOfChildren' type="number"/></div>
                            <div className="input-box"><input readOnly value={data.company_} placeholder='company' type="text"/></div>
                            <div className="input-box"><input readOnly value={data.gender_} placeholder='Gender' type="text"/></div>
                            <div className="input-box"><input readOnly value={data.checkIn} placeholder='checkIn' type="date"/></div>
                            <div className="input-box"><input readOnly value={data.checkOut} placeholder='checkOut' type="date"/></div>
                            <div className="input-box"><input readOnly value={data.numberOfNights} placeholder='numberOfNights' type="number"/></div>
                            <div className="input-box"><input readOnly value={data.roomNumber} placeholder='RoomNo' type="text"/></div>
                        </div>
                        {message && <div className='message'>{message}</div>}
                        <div className="resclick">
                            <input type="submit" value="Check Out"/>
                        </div>    
                    </form>
                </div>
                </div>
                </div>
                </div>
        </div>
    </React.Fragment>
    )
}

export default OGuestCheckout