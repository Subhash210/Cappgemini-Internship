import React from 'react'
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'

function OwnerInventoryNavBar() {
  return (
      <React.Fragment>
        <div className='resnavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
          <ul>             
              <li><NavLink to='/oaddinventory'>Add</NavLink></li>
              <li><NavLink to='/ogetinventory'>Get</NavLink></li>
              <li><NavLink to='/oupdateinventory'>Update</NavLink></li>
              <li><NavLink to='/ownerhome'>Home</NavLink></li>
          </ul>
        </div>
    </React.Fragment>
  )
}

export default OwnerInventoryNavBar