import React from 'react'
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'
import './ManagerInventoryNavBar.css'

function ManagarInventoryNavBar() {
  return (
      <React.Fragment>
        
        <div className='minventorynavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
          <ul>  
              <li><NavLink to='/maddinventory'>Add</NavLink></li>
              <li><NavLink to='/mgetinventory'>Get</NavLink></li>
              <li><NavLink to='/mupdateinventory'>Update</NavLink></li>
              <li><NavLink to='/managerhome'>Home</NavLink></li>
          </ul>
        </div>
    </React.Fragment>
  )
}

export default ManagarInventoryNavBar