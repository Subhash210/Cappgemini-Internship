import React from 'react'
import {NavLink} from "react-router-dom";
import logobrown from '../images/logobrown.png'

function OwnerDepartmentNavBar() {
  return (
      <React.Fragment>
        <div className='resnavbar'>
        <img src={logobrown} className="logobrown" alt='logo' />
          <ul>
            <li><NavLink to='/oadddepartment'>Add</NavLink></li>
            <li><NavLink to='/ogetdepartments'>Get All</NavLink></li>
            <li><NavLink to='/ownerhome'>Home</NavLink></li>
          </ul>
        </div>
    </React.Fragment>
  )
}

export default OwnerDepartmentNavBar