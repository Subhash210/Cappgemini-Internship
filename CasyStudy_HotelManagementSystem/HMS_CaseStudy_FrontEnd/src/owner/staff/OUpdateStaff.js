import React,{useState} from 'react'
import axios from 'axios';
import OwnerStaffNavBar from './OwnerStaffNavBar';


function OUpdateStaff() {
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
    const idurl="Owner/getstaffbyid?staffCode="+staff.staffCode;
    const url ="Owner/updatestaff"
    function staffsubmit(i){
        i.preventDefault(); 
        axios.get(idurl)
            .then(res=>{
                setData(res.data);
            },
           );
        
    }
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
        axios.put(url,item )
            .then(res=>{          
                setMessage("Staff Details updated")
                setTimeout(function(){window.location.reload()},900);
            },
           );
         
        
    }
    function staffhandle(i){
        const newdata={...staff}
        newdata[i.target.id]=i.target.value
        setStaff(newdata)
    }
    
    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)
    }

  return (
    <React.Fragment> 
        <OwnerStaffNavBar/>
        <div className='backimage'>
        <div className="reservesearchbar">
            <form onSubmit={(i)=>staffsubmit(i)}> 
                <input className='idsearch' onChange={(i)=>staffhandle(i)} id="staffCode" value={staff.staffCode} placeholder='Staff Code' type="text"/>
                <button className='idsearchbutton'>search</button>
            </form>
        </div>
        <div className='updatebody'> 
            <div className="container">
            <div className="title">Update Staff Details</div>
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

export default OUpdateStaff