import React from 'react'
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'

function ManagerStaffNavBar() {
  return (
    <div className='minventorynavbar'>
      <img src={logobrown} className="logobrown" alt='logo' />
      <ul>       
            <li><NavLink to='/maddstaff'>Add</NavLink></li>
            <li><NavLink to='/mupdatestaff'>Update</NavLink></li>
            <li><NavLink to='/mgetallstaff'>Get</NavLink></li>
            <li><NavLink to='/mdeletestaff'>Remove</NavLink></li>
            <li><NavLink to='/managerhome'>Home</NavLink></li>
        </ul>
    </div>
  )
}

export default ManagerStaffNavBar;