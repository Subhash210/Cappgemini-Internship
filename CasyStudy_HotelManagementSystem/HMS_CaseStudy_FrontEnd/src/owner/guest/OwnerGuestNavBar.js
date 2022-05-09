import React from 'react'
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'

function OwnerGuestNavBar() {
  return (
      <React.Fragment>
        <div className='ownresnavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
          <ul>
              <li><NavLink to='/oguestadd'>NewGuest</NavLink></li>
              <li><NavLink to='/oguestupdate'>Update</NavLink></li>
              <li><NavLink to='/oguestgetall'>GetAll</NavLink></li>
              <li><NavLink to='/oguestcheckout'>Checkout</NavLink></li>
              <li><NavLink to='/oguestaddreserved'>AddGuest</NavLink></li>
              <li><NavLink to='/oguestdelete'>Delete</NavLink></li>
              <li><NavLink to='/ownerhome'>Home</NavLink></li>
          </ul>
        </div>
    </React.Fragment>
  )
}

export default OwnerGuestNavBar