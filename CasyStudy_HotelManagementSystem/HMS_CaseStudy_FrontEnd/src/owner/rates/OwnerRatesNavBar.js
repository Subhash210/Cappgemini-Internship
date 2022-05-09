import React from 'react'
import {
    NavLink,
  } from "react-router-dom";
  import logobrown from '../images/logobrown.png'

function OwnerRatesNavBar() {
  return (
      <React.Fragment>
      <div className='resnavbar'>
      <img src={logobrown} className="logobrown" alt='logo' />
        <ul>
        <li><NavLink to='/oaddnewrate'>Add</NavLink></li>
        <li><NavLink to='/ogetrates'>Get All</NavLink></li>
        <li><NavLink to='/oupdaterate'>Update</NavLink></li>
        <li><NavLink to='/ownerhome'>Home</NavLink></li>
        </ul>
      </div>
    </React.Fragment>
  )
}

export default OwnerRatesNavBar