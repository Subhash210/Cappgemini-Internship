import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';
import OwnerStaffNavBar from './OwnerStaffNavBar';


function OGetAllStaff() {
  const [staff, setStaff] = useState([]);
  const [searchTermByStaffCode,setSearchTermByStaffCode] = useState('');
  const [searchTermByEmployeeName,setsearchTermByEmployeeName] = useState('');

  const url="Owner/getallstaff";
 
    const init = () => { 
      axios.get(url )
          .then(res=>{
            setStaff(res.data);
          },
          );
        }

    useEffect(() => {
       init();
        }, []);
    axios.interceptors.request.use(
        config => {
        config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
        return config;
          },
        error => {
        return Promise.reject(error);
          });
  return (
    <React.Fragment> 
        <OwnerStaffNavBar/>
        <div className='backimageall'>
        <div className='searchdivall'>
        <input type="text" placeholder="Search By Id" onChange={e=>setSearchTermByStaffCode(e.target.value)} className='reservatioinsearch'/>
        <input type="text" placeholder="Search By Name" onChange={e=>setsearchTermByEmployeeName(e.target.value)} className='reservatioinsearch'/>
        </div>
        <div className='styled-table'>
        <div className='showtable'>  
        <table>
          <thead className="thead-dark">
            <tr>
            <th>Staff Code</th>
              <th>Department Id</th>
              <th>Employee Name</th>
              <th>Phone Number</th>
              <th>Email</th>
              <th>Age</th>
              <th>Address</th>
              <th>Salary</th>
            </tr>
          </thead>
          <tbody>
          {
            staff.filter((staff)=>{
              if(searchTermByStaffCode===""){
                return staff
              }
              else if(staff.staffCode.toLowerCase().includes(searchTermByStaffCode.toLowerCase())){
                return staff
              }
            }).filter((staff)=>{
              if(searchTermByEmployeeName===""){
                return staff
              }
              else if(staff.employeeName.toLowerCase().includes(searchTermByEmployeeName.toLowerCase())){
                return staff
              }
            }).map(staff => (
              <tr key={staff.staffCode}>
                <td>{staff.staffCode}</td>
                <td>{staff.departmentId}</td>
                <td>{staff.employeeName}</td>
                <td>{staff.phoneNo}</td>
                <td>{staff.email}</td>
                <td>{staff.age}</td>
                <td>{staff.employeeAddress}</td>
                <td>{staff.salary}</td>
              </tr>))
          }
          </tbody>
        </table>
      </div>
      </div>
      </div>
    </React.Fragment>
  )
}

export default OGetAllStaff