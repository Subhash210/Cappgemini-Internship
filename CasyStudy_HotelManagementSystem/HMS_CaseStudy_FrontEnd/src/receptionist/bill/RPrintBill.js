import React from 'react'
import { useState } from 'react';
import axios from 'axios';
import RecepBillNavBar from './RecepBillNavBar';
import '../reservation/RresAdd.css'



function RPrintBill() {
  const[data,setData]=useState({        
    billNumber:"",    
})
axios.interceptors.request.use(
    config => {
    config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
    config.headers.accept = "application/pdf";
    return config;
    },
    error => {
    return Promise.reject(error);
    });
    const url="Receptionist/receptionist/bill/printbill?BillCode=" + data.billNumber;
    
    

function handle(e){
    const newdata={...data}
    newdata[e.target.id]=e.target.value
    setData(newdata)
}
return (
<React.Fragment> 
    <RecepBillNavBar/>
    <div className='body'> 
    <div className="container">
    <div className="title">Print Bill</div>
    <br/>
    <div> 
        <form> 
        <div className="user-details">
        <div className="input-box" >
            <input onChange={(e)=>handle(e)} id="billNumber" value={data.billNumber} placeholder='Bill Code' type="text" required/>
        </div>   
        </div>
        <div className="resclick">
             <input type="submit" value="Print"/>
        </div>
        </form>
    </div>
    </div>
    </div>
</React.Fragment>
)
}

export default RPrintBill