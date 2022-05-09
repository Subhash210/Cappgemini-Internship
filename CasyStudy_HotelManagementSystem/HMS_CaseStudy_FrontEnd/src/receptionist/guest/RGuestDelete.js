import React from 'react'
import RecepGuestNavBar from './RecepGuestNavBar';
import { useState } from 'react';
import axios from 'axios';

function RGuestDelete() {
  const[deletedata,setDeleteData]=useState({        
    guestCode_:"",    
})
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
    const url="Receptionist/receptionist/guest/deleteguest?guestCode=" + guest.guestCode_;

function submit(e){
    e.preventDefault();
    axios.delete(url)
        .then(res=>{
            setMessage("Guest Details Removed");
            setTimeout(function(){window.location.reload()},900)
        },
       );
    
}
const idurl="Receptionist/receptionist/guest/getguestbyid?guestCode="+guest.guestCode_;
function guestsubmit(i){
    i.preventDefault(); 
    axios.get(idurl)
        .then(res=>{
            setData(res.data);
        },
       );
    
}

function guesthandle(i){
    const newdata={...guest}
    newdata[i.target.id]=i.target.value
    setGuest(newdata)
}

function handle(e){
    const newdata={...deletedata}
    newdata[e.target.id]=e.target.value
    setDeleteData(newdata)
}
return (
<React.Fragment> 
    <RecepGuestNavBar/>
    <div className='backimage'>
        <div  className="reservesearchbar">
            <form onSubmit={(i)=>guestsubmit(i)}> 
                <input className='idsearch' onChange={(i)=>guesthandle(i)} id="guestCode_" value={guest.guestCode_} placeholder='Guest Code' type="text"/>
                <button  className='idsearchbutton'>Search</button>
            </form>
        </div>
        <div className='updatebody'>  
            <div className="container">
            <div className="title">New Guest</div>
            <div  className='content'> 
            <div> 
            <form onSubmit={(e)=>submit(e)}>
                <div className="user-details">  
                    <div className="input-box"><input value={data.guestCode_} placeholder='Guest Code' type="text" readOnly/></div>
                    <div className="input-box"><input value={data.name_} placeholder='Name' type="text" readOnly/></div>
                    <div className="input-box"><input value={data.phoneNumber_} placeholder='Phone Number' type="text" readOnly/></div>
                    <div className="input-box"><input value={data.emailId_} placeholder='EmailId' type="email" readOnly/></div>
                    <div className="input-box"><input value={data.gender_} placeholder='Gender' type="text" readOnly/></div>
                    <div className="input-box"><input value={data.address_} placeholder='Address' type="text" readOnly/></div>
                    <div className="input-box"><input value={data.numberOfAdult} placeholder='Number Of Adult' type="number" readOnly/></div>
                    <div className="input-box"><input value={data.numberOfChildren} placeholder='Number Of Children' type="number" readOnly/></div>
                    <div className="input-box"><input value={data.company_} placeholder='Company' type="text" readOnly/></div>
                    <div className="input-box"><input value={data.checkIn} placeholder='Check In' type="date" readOnly/></div>
                    <div className="input-box"><input value={data.checkOut} placeholder='Check Out' type="date" readOnly/></div>
                    <div className="input-box"><input value={data.numberOfNights} placeholder='Number Of Nights' type="number" readOnly/></div>
                    <div className="input-box"><input value={data.roomNumber} placeholder='RoomNo' type="text" readOnly/></div>
                </div>
                {message && <div className='message'>{message}</div>}
                <div className="resclick">
                        <input type="submit" value="Delete"/>
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

export default RGuestDelete