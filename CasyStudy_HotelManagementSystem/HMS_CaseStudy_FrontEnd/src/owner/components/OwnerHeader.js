import React, { Component,useState, useEffect } from "react";
import {NavLink} from "react-router-dom";
import './OwnerHeader.css'
import authService from "../services/auth.service";

function OwnerHeader() {
    const [currentUser, setCurrentUser] = useState(undefined);
  
    useEffect(() => {
      const user = authService.getCurrentUser();
  
      if (user) {
        setCurrentUser(user);
      }
    }, []);

    const logOut = () => {
      authService.logout();
    };

  return (
    <div className='ownerheader'>
       <NavLink to="/ochangepassword" className="changepasswordown">Change Password</NavLink>
       {currentUser ? (
               <a href="/"  onClick={logOut} className='logoutown'>
                 Logout
               </a>
         ) 
         : (
               <NavLink to={"/ownerlogin/*"} className='logoutown'>
                 Login
               </NavLink>
         )
         }
  </div>
  )
}

export default OwnerHeader