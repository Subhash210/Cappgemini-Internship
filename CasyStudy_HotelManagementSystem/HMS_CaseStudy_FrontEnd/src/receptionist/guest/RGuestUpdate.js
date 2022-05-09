import React,{useState} from 'react'
import axios from 'axios';
import RecepGusNavBar from './RecepGuestNavBar';
import '../reservation/RresAdd';

function RGuestUpdate() {
    const[guest,setGuest]=useState({        
        guestCode_:"",    
    })
    const[message,setMessage]=useState(null);
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
    const idurl="Receptionist/receptionist/guest/getguestbyid?guestCode="+guest.guestCode_;
    const url="Receptionist/receptionist/guest/updateGuest"
    function guestsubmit(i){
        i.preventDefault(); 
        axios.get(idurl)
            .then(res=>{
                setData(res.data);
            },
           );
        
    }
    function submit(e){
        const item={
            reservationCode:data.reservationCode,
            roomNumber:data.roomNumber,
            numberOfAdult:data.numberOfAdult,  
            numberOfChildren:data.numberOfChildren,
            checkIn:data.checkIn,
            checkOut:data.checkOut,
            numberOfNights:data.numberOfNights,
            name_:data.name_,
            emailId_:data.emailId_,  
            phoneNumber_:data.phoneNumber_,
            gender_:data.gender_,
            address_:data.address_,
            company_:data.company_,
            todayDate_:data.todayDate_,
            guestCode_:data.guestCode_,
            guestStatus_:data.guestStatus_
            }
        e.preventDefault();
        axios.put(url,item )
            .then(res=>{
                setMessage("Guest Details Update");
                setTimeout(function(){window.location.reload()},900)
            },
           );

        
    }
    function guesthandle(i){
        const newdata={...guest}
        newdata[i.target.id]=i.target.value
        setGuest(newdata)
    }
    
    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)
    }

  return (
    <React.Fragment> 
        <RecepGusNavBar/>
        <div className='backimage'>
            <div  className="reservesearchbar"> 
                <form onSubmit={(i)=>guestsubmit(i)}> 
                    <input className='idsearch' onChange={(i)=>guesthandle(i)} id="guestCode_" value={guest.guestCode_} placeholder='Guest Code' type="text"/>
                    <button className='idsearchbutton'>Search</button>
                </form>
            </div>
            <div className='updatebody'>  
                <div className="container">
                <div className="title">Update Guest Details</div>
                <div  className='content'> 
                <form onSubmit={(e)=>submit(e)}> 
                    <div className="user-details">
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="reservationCode" value={data.reservationCode} placeholder='Reservation Code' type="text" required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="name_" value={data.name_} placeholder='Name' type="text" required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="phoneNumber_" value={data.phoneNumber_} placeholder='Phone Number' type="text" required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="emailId_" value={data.emailId_} placeholder='Email Id' type="email"  required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="address_" value={data.address_} placeholder='Address' type="text" required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="numberOfAdult" value={data.numberOfAdult} placeholder='Number Of Adults' type="number" required /></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="gender_" value={data.gender_} placeholder='Gender' type="text"  required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="numberOfChildren" value={data.numberOfChildren} placeholder='Number Of Children' type="number" required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="company_" value={data.company_} placeholder='Company' type="text" required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="checkIn" value={data.checkIn} placeholder='Check In' type="date" required/></div>
                        <div className="input-box"><input onChange={(e)=>handle(e)} id="checkOut" value={data.checkOut} placeholder='Check Out' type="date" required/></div>
                        <div className="input-box" ><input onChange={(e)=>handle(e)} id="numberOfNights" value={data.numberOfNights} placeholder='Number Of Nights' type="number" required/></div>
                        <div className="input-box" ><input onChange={(e)=>handle(e)} id="roomNumber" value={data.roomNumber} placeholder='Room No' type="text" required/></div>
        
            </div>
            {message && <div className='message'>{message}</div>}
            <div className="resclick">
                    <input type="submit" value="Update"/>
            </div>                
                </form>
                </div>
                </div>
                </div>
        </div>
    </React.Fragment>
  )
}

export default RGuestUpdate