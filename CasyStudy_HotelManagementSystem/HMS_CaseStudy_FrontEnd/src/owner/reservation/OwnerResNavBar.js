import React from 'react'
import {NavLink} from "react-router-dom";
import './OwnerResNavBar.css'
import logobrown from '../images/logobrown.png'


function OwnerResNavBar() {
  return (
      <React.Fragment>
        <div className='ownresnavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
        <ul>           
          <li><NavLink to='/oresadd'>Add</NavLink></li>
          <li><NavLink to='/oresupdate'>Update</NavLink></li>
          <li><NavLink to='/oresgetall'>GetAll</NavLink></li>
          <li><NavLink to='/ownerhome'>Home</NavLink></li> 
        </ul>
        </div>
    </React.Fragment>
  )
}

export default OwnerResNavBar