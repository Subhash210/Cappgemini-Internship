import React from 'react'
import {NavLink} from "react-router-dom";
import './ManagerRoomsNavBar.css'
import logobrown from '../images/logobrown.png'

function ManagerRoomsNavBar() {
  return (
    <div className='mroomsnavbar'>
      <img src={logobrown} className="logobrown" alt='logo' />
      <ul>
            <li><NavLink to='/maddroom'>Add</NavLink></li>
            <li><NavLink to='/mgetallrooms'>Show</NavLink></li>
            <li><NavLink to='/mdeleteroom'>Delete</NavLink></li>
            <li><NavLink to='/managerhome'>Home</NavLink></li>
        </ul>
    </div>
  )
}

export default ManagerRoomsNavBar;