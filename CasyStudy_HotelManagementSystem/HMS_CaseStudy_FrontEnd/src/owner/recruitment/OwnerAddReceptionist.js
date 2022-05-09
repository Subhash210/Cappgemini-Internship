import React,{useState} from 'react';
import axios from 'axios';
import {NavLink, useNavigate} from 'react-router-dom';
import OwnerDetailsNavBar from './OwnerDetailsNavBar';

function OwnerAddReceptionist() {
    const url="Owner/owner/addreceptionist";
    const[data,setData]=useState({
        userId:"",
        password:""
    })
    const[message , setMessage] = useState(null);
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
            userId:data.userId,
            password:data.password
            }
        e.preventDefault();
        axios.post(url,item )
            .then(res=>{
                setMessage("Receptionist Details Added")
                setTimeout(function(){window.location.reload()},900);
            },
           );
        
    }

    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)
    }
  return (
    <React.Fragment>
       <OwnerDetailsNavBar/> 
        <div className='body'>  
        <div className="container">
        <div className="title">Add New Receptionist Login Details</div>
        <div  className='content'> 
            <form onSubmit={(e)=>submit(e)}>
            <div className="user-details">  
                <div className="input-box"><input onChange={(e)=>handle(e)} id="userId" value={data.userId} placeholder='User Id' type="text" required/></div>
                <div className="input-box"><input onChange={(e)=>handle(e)} id="password" value={data.password} placeholder='Password' type="password" required/></div>
                </div>
            {message && <div className='message'>{message}</div>}    
            <div className="resclick">
            <input type="submit" value="Add"/>
            </div>
            </form>
        </div>
        </div>
        </div>
    </React.Fragment>
  )
}

export default OwnerAddReceptionist;