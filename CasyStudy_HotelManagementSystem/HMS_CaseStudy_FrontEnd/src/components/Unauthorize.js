import React from 'react'
import { NavLink } from 'react-router-dom'
import error401 from './images/error401.jpg';
import './Unauthorize.css'

function Unathorize() {
  return (
    <React.Fragment>
      <div className='image401'>
        
      <div className='unauth'>
        <NavLink to="/">Back To Home</NavLink> 
      </div>
      <div className='image401'><img src={error401} className="error401" alt='Notauthorized'/></div>
      
      </div>
    </React.Fragment>
  )
}

export default Unathorize