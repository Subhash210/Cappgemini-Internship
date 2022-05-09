import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';

import OwnerBillNavBar from './OwnerBillNavBar';

function OGetAllBills() {

  const [searchTermByBillNumber,setSearchTermByBillNumber] = useState('');
  const [searchTermByGuestCode,setSearchTermByGuestCode] = useState('');
  const [bills, setBill] = useState([]);
  axios.interceptors.request.use(
    config => {
    config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
    return config;
    },
    error => {
    return Promise.reject(error);
    });

    const url="Owner/owner/bill/getallbills";
 
    const init = () => { 
      axios.get(url )
          .then(res=>{
            setBill(res.data);
          },
          );
        }

    useEffect(() => {
       init();
        }, []);
  
  return (
    <React.Fragment> 
        <OwnerBillNavBar/>
        <div className='backimageall'>
        <div className='searchdivall'>
        <input type="text" placeholder="Search By Bill Number" onChange={e=>setSearchTermByBillNumber(e.target.value)} className='reservatioinsearch' />
        <input type="text" placeholder="Search By Guest Code" onChange={e=>setSearchTermByGuestCode(e.target.value)} className='reservatioinsearch' />
        </div>
        <div className='styled-table'>
        <div className='showtable'>    
        <table>
          <thead >
            <tr>
              <th>Date</th>
              <th>Bill Number</th>
              <th>Guest Code</th>
              <th>Quantity</th>
              <th>Taxes</th>
              <th>Services</th>
              <th>Unit</th>
              <th>Total Price</th>
            </tr>
          </thead>
          <tbody>
          {
            bills.filter((bills)=>{
              if(searchTermByBillNumber===""){
                return bills
              }
              else if(bills.billNumber.toLowerCase().includes(searchTermByBillNumber.toLowerCase())){
                return bills
              }
            }).filter((bills)=>{
              if(searchTermByGuestCode===""){
                return bills
              }
              else if(bills.guestCode.toLowerCase().includes(searchTermByGuestCode.toLowerCase())){
                return bills
              }
            }).map(bills => (
              
              <tr key={bills.billNumber}>
                <td>{bills.date}</td>
                <td>{bills.billNumber}</td>
                <td>{bills.guestCode}</td>
                <td>{bills.quantity}</td>
                <td>{bills.taxes}</td>
                <td>{bills.services}</td>
                <td>{bills.unit}</td>
                <td>{bills.totalPrice_}</td>
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

export default OGetAllBills