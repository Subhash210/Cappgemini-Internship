import React from 'react'
import OwnerStaffNavBar from './OwnerStaffNavBar';
import { useState } from 'react';
import axios from 'axios';


function ODeleteStaff() {
    
    const[staff,setStaff]=useState({        
        staffCode:"",    
    })
    const[message , setMessage] = useState(null);
    const[data,setData]=useState({
        staffCode:"",
        departmentId:"",
        employeeName:"",
        phoneNo:"",
        email:"",
        age:"",
        employeeAddress:"",
        salary:""
    })
    axios.interceptors.request.use(
        config => {
        config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
        return config;
        },
        error => {
        return Promise.reject(error);
        });
        
    const url="Owner/deletestaff?staffCode=" + staff.staffCode;
    
    function submit(e){
        e.preventDefault();
        axios.delete(url)
            .then(res=>{
                setMessage("Staff Removed")
                setTimeout(function(){window.location.reload()},900);
            },
           );
        
    }
    const idurl="Owner/getstaffbyid?staffCode="+staff.staffCode;
    function staffsubmit(i){
        i.preventDefault(); 
        axios.get(idurl)
            .then(res=>{
                setData(res.data);
            },
           );
        
    }
    
    function staffhandle(i){
        const newdata={...staff}
        newdata[i.target.id]=i.target.value
        setStaff(newdata)
    }
    return (
    <React.Fragment> 
        <OwnerStaffNavBar/>
        <div className='backimage'>
            <div  className="reservesearchbar">
                <form onSubmit={(i)=>staffsubmit(i)}> 
                    <input className='idsearch' onChange={(i)=>staffhandle(i)} id="staffCode" value={staff.staffCode} placeholder='Staff Code' type="text"/>
                    <button className='idsearchbutton'>search</button>
                </form>
            </div>
            <div className='updatebody'>  
                <div className="container">
                <div className="title">Remove Staff</div>
                <div  className='content'> 
                <div>
                <form onSubmit={(e)=>submit(e)}>
                    <div className="user-details"> 
                        <div className="input-box"><input  value={data.staffCode} placeholder='Staff Code' readOnly/></div>
                        <div className="input-box"><input  value={data.departmentId} placeholder='Department Id' readOnly/></div>
                        <div className="input-box"><input  value={data.employeeName} placeholder='Name' readOnly/></div>
                        <div className="input-box"><input  value={data.phoneNo} placeholder='Phone Number' readOnly/></div>
                        <div className="input-box"><input  value={data.email} placeholder='Email' readOnly/></div>
                        <div className="input-box"><input  value={data.age} placeholder='Age' readOnly/></div>
                        <div className="input-box"><input  value={data.employeeAddress} placeholder='Address' readOnly/></div>
                        <div className="input-box"><input  value={data.salary} placeholder='Salary' readOnly/></div>
                    </div>
                    {message && <div className='message'>{message}</div>}
                    <div className="resclick">
                        <input type="submit" value="Remove"/>
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

export default ODeleteStaff