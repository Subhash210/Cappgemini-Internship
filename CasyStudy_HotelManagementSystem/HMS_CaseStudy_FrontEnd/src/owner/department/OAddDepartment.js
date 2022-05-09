import React,{useState} from 'react';
import axios from 'axios';
import OwnerDepartmentNavBar from './OwnerDepartmentNavBar';

function OAddDepartment() {
    const url="Owner/owner/department/adddepartment"
    const[message , setMessage] = useState(null);
    const[data,setData]=useState({
        departmentId:"",
        departmentName:"",
        numberOfEmplyees:""   
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
            departmentId:data.departmentId,
            departmentName:data.departmentName,
            numberOfEmplyees:parseInt(data.numberOfEmplyees)
            }
        e.preventDefault();
        axios.post(url,item )
            .then(res=>{
                setMessage("New Department Added")
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
        <OwnerDepartmentNavBar/>
        <div className='body'>  
        <div className="container">
        <div className="title">New Department</div>
        <div  className='content'> 
            <form onSubmit={(e)=>submit(e)}>
            <div className="user-details"> 
                <div className="input-box"><input onChange={(e)=>handle(e)} id="departmentId" value={data.departmentId} placeholder='Department Id' type="text" required/></div>
                <div className="input-box"><input onChange={(e)=>handle(e)} id="departmentName" value={data.departmentName} placeholder='Department Name' type="text" required/></div>
                <div className="input-box"><input onChange={(e)=>handle(e)} id="numberOfEmplyees" value={data.numberOfEmplyees} placeholder='Employee Count' type="number" required/></div>
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

export default OAddDepartment;