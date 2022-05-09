import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';
import OwnerDepartmentNavBar from './OwnerDepartmentNavBar';


function OGetAllDepartments() {

  const [department, setDepartment] = useState([]);
  const [searchByDepartmentId,setSearchByDepartmentId] = useState('');
  
  const url="Owner/owner/department/getalldepartments"
 
    const init = () => { 
      axios.get(url)
          .then(res=>{
            setDepartment(res.data);
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
        <OwnerDepartmentNavBar/>
        <div className='backimageall'>
        <div className='searchdivall'>
        <input type="text" placeholder="Search By Id" onChange={e=>setSearchByDepartmentId(e.target.value)} className='reservatioinsearch'/>
        </div>
        <div className='styled-table'>
        <div className='showtable'>   
        <table>
          <thead className="thead-dark">
            <tr>
            <th>Department Id</th>
              <th>Department Name</th>
              <th>Employee Count</th>
            </tr>
          </thead>
          <tbody>
          {
            department.filter((department)=>{
              if(searchByDepartmentId==""){
                return department
              }
              else if(department.departmentId.toLowerCase().includes(searchByDepartmentId.toLowerCase())){
                return department
              }
            }).map(department => (
              <tr key={department.departmentId}>
                <td>{department.departmentId}</td>
                <td>{department.departmentName}</td>
                <td>{department.numberOfEmplyees}</td>
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

export default OGetAllDepartments