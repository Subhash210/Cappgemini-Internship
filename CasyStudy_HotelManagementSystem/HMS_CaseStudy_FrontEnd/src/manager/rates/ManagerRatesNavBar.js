import React from 'react';
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'

function ManagerRatesNavBar() {
  return (
      <React.Fragment>
        <div className='minventorynavbar'>
         <img src={logobrown} className="logobrown" alt='logo' />
          <ul>           
            <li><NavLink to='/maddnewrate'>Add</NavLink></li>
            <li><NavLink to='/mgetrates'>Get</NavLink></li>
            <li><NavLink to='/mupdaterate'>Update</NavLink></li>
            <li><NavLink to='/managerhome'>Home</NavLink></li>
          </ul>
        </div>
    </React.Fragment>
  )
}

export default ManagerRatesNavBar