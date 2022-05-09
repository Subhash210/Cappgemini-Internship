import React,{useState} from 'react'
import axios from 'axios';
import {useNavigate ,NavLink} from 'react-router-dom';
import './OwnerDetailsNavBar.css';
import logobrown from '../images/logobrown.png'

function UpdateOwnerDetails() {
    const[data,setData]=useState({
        userId:"",
        password:"",
        newpassword:""
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
    const url = "Owner/owner/updateowner?newpassword="+data.newpassword
    const navigate =  useNavigate();
    function submit(e){
        const item={
            userId:data.userId,
            password:data.password,
            newpassword:data.newpassword
            }
        e.preventDefault();
        axios.put(url,item )
            .then(res=>{
                setMessage("Owner Details updated")
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
        <div className='odetailsnavbar'> <img src={logobrown} className="logobrown" alt='logo' /><ul><li><NavLink to="/ownerhome">Home</NavLink></li></ul></div> 
        <div className='backimage'>
        <div className='updatebody'> 
            <div className="container">
            <div className="title">Update Manager Details</div>
            <div  className='content'> 
            <form onSubmit={(e)=>submit(e)}>
                <div className="user-details"> 
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="userId" value={data.userId} placeholder='User Id' type="text" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="password" value={data.password} placeholder='Old Password' type="password" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="newpassword" value={data.newpassword} placeholder='New Password' type="password" required/></div>
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

export default UpdateOwnerDetails;