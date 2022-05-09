import React from 'react'
import {
    NavLink
  } from "react-router-dom";
  import './RecepResNavBar.css'
  import logobrown from '../images/logobrown.png'



function RecepResNavBar() {
  return (
      <React.Fragment>
        <div className='resnavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
        <ul>
            <li><NavLink to='/rreservationadd'>Add</NavLink></li>
            <li><NavLink to='/rresupdate'>Update</NavLink></li>
            <li><NavLink to='/rresgetall'>GetAll</NavLink></li>
            <li><NavLink to='/recephome'>Home</NavLink></li>
        </ul>
        </div>
    </React.Fragment>
  )
}

export default RecepResNavBar