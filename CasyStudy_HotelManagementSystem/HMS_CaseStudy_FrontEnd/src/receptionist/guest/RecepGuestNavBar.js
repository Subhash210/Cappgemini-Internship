import React from 'react'
import {
    NavLink
  } from "react-router-dom";
import './RGuestNavBar.css'
import logobrown from '../images/logobrown.png'

function RecepGusNavBar() {
  return (
      <React.Fragment>
        <div className='guestnavbar'>
        <img src={logobrown} className="logobrown" alt='logo'/>
          <ul>
            <li><NavLink to='/rguestadd'>NewGuest</NavLink></li>
            <li><NavLink to='/rguestupdate'>Update</NavLink></li>
            <li><NavLink to='/rguestgetall'>GetAll</NavLink></li>
            <li><NavLink to='/rguestcheckout'>Checkout</NavLink></li>
            <li><NavLink to='/rguestaddreserved'>AddGuest</NavLink></li>
            <li><NavLink to='/rguestdelete'>Delete</NavLink></li>
            <li><NavLink to='/recephome'>Home</NavLink></li>
          </ul>
        </div>
    </React.Fragment>
  )
}

export default RecepGusNavBar