import React,{useState} from 'react';
import axios from 'axios';

import OwnerBillNavBar from './OwnerBillNavBar';

function OGenerateBill() {

    const[message,setMessage]=useState(null);
    const[data,setData]=useState({        
        billNumber:"",
        guestCode:"",
        quantity:"",
        totalPrice_:"",
        taxes:"",  
        date:"",
        services:"",
        unit:"",
        rateId:""
    })
    axios.interceptors.request.use(
        config => {
        config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
        return config;
        },
        error => {
        return Promise.reject(error);
        });
        const url = "Owner/owner/bill/generatebill?guestCode="+data.guestCode+"&rateId="+data.rateId;
    function submit(e){
        const item={
            date:data.date,
            billNumber:data.billNumber,
            guestCode:data.guestCode,
            quantity:data.quantity,
            totalPrice_:data.totalPrice_,
            taxes:data.taxes,
            services:data.services,
            unit:data.unit
            }
        e.preventDefault();
        axios.post(url,item)
            .then(res=>{
                setMessage("Bill Generated");
                setTimeout(function(){window.location.reload()},900)
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
        <OwnerBillNavBar/>
        <div className='body'>  
        <div className="container">
        <div className="title">Generate Bill</div>
        <div  className='content'> 
            <form onSubmit={(e)=>submit(e)}>
            <div className="user-details">
                <div className='input-box'>               
                <input onChange={(e)=>handle(e)} id="guestCode" value={data.guestCode} placeholder='Guest Code' type="text" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="quantity" value={data.quantity} placeholder='Quantity' type="number" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="services" value={data.services} placeholder='Services' type="number" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="unit" value={data.unit} placeholder='Unit' type="number" required/>
                </div>
                <div className="input-box">
                <input onChange={(e)=>handle(e)} id="rateId" value={data.rateId} placeholder='Rate Id' type="text" required/>
                </div>
                </div>
                {message && <div className='message'>{message}</div>}
                <div className="resclick">
                <input type="submit" value="Generate"/>
                </div>
                
            </form>
        </div>
        </div>
        </div>
    </React.Fragment>
)
}

export default OGenerateBill