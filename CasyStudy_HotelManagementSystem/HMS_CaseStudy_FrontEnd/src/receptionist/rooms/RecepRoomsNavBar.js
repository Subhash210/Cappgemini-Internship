import React from 'react'
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'

function RecepRoomsNavBar() {
  return (
    <div className='resnavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
      <ul>
            <li><NavLink to='/recephome'>Home</NavLink></li>
        </ul>
    </div>
  )
}

export default RecepRoomsNavBar;