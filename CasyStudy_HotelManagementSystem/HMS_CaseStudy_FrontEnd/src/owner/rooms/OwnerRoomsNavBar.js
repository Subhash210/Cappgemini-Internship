import React from 'react'
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'

function OwnerRoomsNavBar() {
  return (
      <div className='ownresnavbar'>
          <img src={logobrown} className="logobrown" alt='logo' />
      <ul>
            <li><NavLink to='/oaddroom'>Add </NavLink></li>
            <li><NavLink to='/ogetallrooms'>GetAll </NavLink></li>
            <li><NavLink to='/odeleteroom'>Delete </NavLink></li>
            <li><NavLink to='/ownerhome'>Home</NavLink></li>
        </ul>
      </div>
  )
}

export default OwnerRoomsNavBar;