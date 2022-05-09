import React,{useState} from 'react';
import axios from 'axios';
import OwnerRoomsNavBar from './OwnerRoomsNavBar';

function OAddRoom() {
    const url="Owner/owner/rooms/addrooms"
    const[message , setMessage] = useState();
    const[data,setData]=useState({       
        roomNumber:"",
        roomStatus_:"",
        totalRooms_:""

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
            roomNumber:data.roomNumber,
            roomStatus_:data.roomStatus_,
            totalRooms_:data.totalRooms_,
            }
        e.preventDefault();
        axios.post(url,item )
            .then(res=>{
                setMessage("Room Added")
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
        <OwnerRoomsNavBar/>
        <div className='body'> 
        <div className="container">
        <div className="title">Add Rooms</div>
        <br/>
        <div> 
            <form onSubmit={(e)=>submit(e)}>
            <div className="user-details">
            <div className="input-box" >
                <input onChange={(e)=>handle(e)} id="roomNumber" value={data.roomNumber} placeholder='Room Number' type="text" required/>
            </div>
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

export default OAddRoom