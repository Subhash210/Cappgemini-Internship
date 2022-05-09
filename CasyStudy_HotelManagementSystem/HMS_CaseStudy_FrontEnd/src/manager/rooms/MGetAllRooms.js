import React from 'react'
import { useEffect, useState } from 'react';
import axios from 'axios';
import ManagerRoomsNavBar from './ManagerRoomsNavBar';


function MGetAllRooms() {

  const [searchByRoomNumber,setSearchByRoomNumber] = useState('');
  const [rooms, setRooms] = useState([]);
  axios.interceptors.request.use(
    config => {
    config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
    return config;
    },
    error => {
    return Promise.reject(error);
    });

 const url="Manager/manager/rooms/getallrooms";
 
    const init = () => { 
      axios.get(url)
          .then(res=>{
            setRooms(res.data);
          },
          );
        }

    useEffect(() => {
       init();
        }, []);
  
  return (
    <React.Fragment> 
        <ManagerRoomsNavBar/>
        <div className='backimageall'>
        <div className='searchdivall'>
        <input type="text" placeholder="Search By Id" onChange={e=>setSearchByRoomNumber(e.target.value)} className='reservatioinsearch'/>
        </div>
        <div className='styled-table'>
        <div className='showtable'>    
        <table>
          <thead>
            <tr>
            <th>Room Number</th>
              <th>Room Status</th>
              <th>Total Rooms</th>
            </tr>
          </thead>
          <tbody>
          {
            rooms.filter((rooms)=>{
              if(searchByRoomNumber===""){
                return rooms
              }
              else if(rooms.roomNumber.toLowerCase().includes(searchByRoomNumber.toLowerCase())){
                return rooms
              }
            }).map(rooms => (             
              <tr key={rooms.roomNumber}>
                <td>{rooms.roomNumber}</td>
                <td>{rooms.roomStatus_}</td>
                <td>{rooms.totalRooms_}</td>
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

export default MGetAllRooms