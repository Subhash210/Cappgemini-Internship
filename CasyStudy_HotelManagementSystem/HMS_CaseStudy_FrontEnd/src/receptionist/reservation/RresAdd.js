import React,{useState} from 'react';
import axios from 'axios';
import RecepResNavBar from './RecepResNavBar';
import "./RresAdd.css"


export function RresAdd() {

   const url = "Receptionist/Receptionist/reservation/addreservation";
   const[message,setMessage]=useState(null);
    const[data,setData]=useState({        
        name:"",
        phoneNumber:"",
        emailId:"",
        gender:"",
        address:"",  
        numberOfAdult:"",
        numberOfChildren:"",
        company:"",
        checkIn:"",
        checkOut:"",
        numberOfNights:"",  
         reservationCode_:"",
         status_:""
    })
    axios.interceptors.request.use(
        config => {
        config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
        return config;
        },
        error => {
        return Promise.reject(error);
        });
    function submit(e){
        const item={
            name:data.name,
            phoneNumber:data.phoneNumber,
            emailId:data.emailId,
            gender:data.gender,
            address:data.address,
            numberOfAdult:data.numberOfAdult,
            numberOfChildren:data.numberOfChildren,
            company:data.company,
            checkIn:data.checkIn,
            checkOut:data.checkOut,
            numberOfNights:data.numberOfNights,
            reservationCode_:data.reservationCode_,
            status_:data.status_
            }
        e.preventDefault();
        axios.post(url,item)
            .then(res=>{
                setMessage("Reservation Booked")
                setTimeout(function(){window.location.reload()},900);
            },
           );
        
    }

    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)
    }

return(
    <React.Fragment> 
    <RecepResNavBar/>
    <div className='body'>  
        <div className="container">
        <div className="title">New Booking</div>
        <div  className='content'> 
            <form onSubmit={(e)=>submit(e)}>    
            <div className="user-details">
                
                <div className="input-box" >
                    <input onChange={(e)=>handle(e)} id="name" value={data.name} placeholder='Name' type="text"  required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="numberOfAdult" value={data.numberOfAdult} placeholder='Number Of Adult' type="number" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="phoneNumber" value={data.phoneNumber} placeholder='Phone Number' type="text" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="numberOfChildren" value={data.numberOfChildren} placeholder='Number Of Children' type="number" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="emailId" value={data.emailId} placeholder='Email Id' type="email" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="checkIn" value={data.checkIn} placeholder='Check In' type="date" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="address" value={data.address} placeholder='Address' type="text" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="checkOut" value={data.checkOut} placeholder='Check Out' type="date" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="company" value={data.company} placeholder='Company' type="text" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="numberOfNights" value={data.numberOfNights} placeholder='Number Of Nights' type="number"/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="gender" value={data.gender} placeholder='Gender' type="text"/>
                </div>
               
            </div>
            {message && <div className='message'>{message}</div>}
            <div className="resclick">
            <input type="submit" value="Register"/>
            </div>
                </form>
            </div>
        </div>
    </div>
    </React.Fragment>
)
}

export default RresAdd