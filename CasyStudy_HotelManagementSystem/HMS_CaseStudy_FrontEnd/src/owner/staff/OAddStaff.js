import React,{useState} from 'react';
import axios from 'axios';
import OwnerStaffNavBar from './OwnerStaffNavBar';

function OAddStaff() {
    const url="Owner/addstaff";
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
    
    function submit(e){
        const item={
            staffCode:data.staffCode,
            departmentId:data.departmentId,
            employeeName:data.employeeName,  
            phoneNo:data.phoneNo,
            email:data.email,
            age:data.age,
            employeeAddress:data.employeeAddress,
            salary:data.salary
            }
        e.preventDefault();
        axios.post(url,item)
            .then(res=>{
                setMessage("Staff Details Added")
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
        <OwnerStaffNavBar/>
        <div className='body'>  
        <div className="container">
        <div className="title">Add Staff</div>
        <div  className='content'> 
            <form onSubmit={(e)=>submit(e)}>
                <div className="user-details"> 
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="staffCode" value={data.staffCode} placeholder='Staff Code' type="text" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="departmentId" value={data.departmentId} placeholder='Department Id' type="text" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="employeeName" value={data.employeeName} placeholder='Employee Name' type="text" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="phoneNo" value={data.phoneNo} placeholder='Phone Number' type="text" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="email" value={data.email} placeholder='Email' type="email" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="age" value={data.age} placeholder='Age' type="number" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="employeeAddress" value={data.employeeAddress} placeholder='Address' type="text" required/></div>
                    <div className="input-box"><input onChange={(e)=>handle(e)} id="salary" value={data.salary} placeholder='Salary' type="text" required/></div>
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

export default OAddStaff;