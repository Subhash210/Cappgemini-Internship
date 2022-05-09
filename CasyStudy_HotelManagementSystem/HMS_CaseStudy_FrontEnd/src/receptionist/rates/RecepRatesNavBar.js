import React from 'react'
import {
    NavLink,
  } from "react-router-dom";
import logobrown from '../images/logobrown.png'

function RecepRatesNavBar() {
  return (
      <React.Fragment>
        <div className='resnavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
        <ul>
        <li><NavLink to='/recephome'>Home</NavLink></li>
        </ul>
        </div>
    </React.Fragment>
  )
}

export default RecepRatesNavBar