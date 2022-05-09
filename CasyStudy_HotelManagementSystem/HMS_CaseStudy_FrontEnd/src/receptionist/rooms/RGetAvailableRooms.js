import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';
import RecepRoomsNavBar from './RecepRoomsNavBar';

function RGetAvailableRooms() {

  const [searchByRoomNumber,setSearchByRoomNumber] = useState('');
  const [availableRooms, setAvailableRooms] = useState([]);
  axios.interceptors.request.use(
    config => {
    config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
    return config;
    },
    error => {
    return Promise.reject(error);
    });

   const url="Receptionist/Receptionist/rooms/availablerooms"
 
    const init = () => { 
      axios.get(url)
          .then(res=>{
            setAvailableRooms(res.data);
          },
          );
        }

    useEffect(() => {
       init();
        }, []);
  
  return (
    <React.Fragment> 
        <RecepRoomsNavBar/>
        <div className='backimageall'>
        <div className='searchdivall'>
        <input type="text" placeholder="Search By Room.No" onChange={e=>setSearchByRoomNumber(e.target.value)} className='reservatioinsearch' />
        </div>  
        <div className='styled-table'>
        <div className='showtable'>  
        <table>
          <thead >
            <tr>
            <th>Room Number</th>
              <th>Room Status</th>
              <th>Total Rooms</th>
            </tr>
          </thead>
          <tbody>
          {
            availableRooms.filter((availableRooms)=>{
              if(searchByRoomNumber===""){
                return availableRooms
              }
              else if(availableRooms.roomNumber.toLowerCase().includes(searchByRoomNumber.toLowerCase())){
                return availableRooms
              }
            }).map(availableRooms => ( 
              <tr key={availableRooms.roomNumber}>
                <td>{availableRooms.roomNumber}</td>
                <td>{availableRooms.roomStatus_}</td>
                <td>{availableRooms.totalRooms_}</td>
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

export default RGetAvailableRooms;