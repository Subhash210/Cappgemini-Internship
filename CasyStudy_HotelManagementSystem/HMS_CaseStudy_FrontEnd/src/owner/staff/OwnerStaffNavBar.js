import React from 'react'
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'

function OwnerStaffNavBar() {
  return (
    <div className='resnavbar'>
      <img src={logobrown} className="logobrown" alt='logo' />
      <ul>       
            <li><NavLink to='/oaddstaff'>Add</NavLink></li>
            <li><NavLink to='/oupdatestaff'>Update</NavLink></li>
            <li><NavLink to='/ogetallstaff'>Get All</NavLink></li>
            <li><NavLink to='/odeletestaff'>Remove</NavLink></li>
            <li><NavLink to='/ownerhome'>Home</NavLink></li>
        </ul>
    </div>
  )
}

export default OwnerStaffNavBar;