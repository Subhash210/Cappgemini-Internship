import React from 'react'
import {NavLink} from "react-router-dom";
import './OwnerDetailsNavBar.css'
import logobrown from '../images/logobrown.png'

function OwnerDetailsNavBar() {
  return (
      <React.Fragment>
        <div className='odetailsnavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
          <ul>
            <li><NavLink to='/oowneraddreceptionist'>AddReceptionist</NavLink></li>
            <li><NavLink to='/oaddmanager'>AddManager</NavLink></li>
            <li><NavLink to='/ownerhome'>Home</NavLink></li>
          </ul>
        </div>
    </React.Fragment>
  )
}

export default OwnerDetailsNavBar