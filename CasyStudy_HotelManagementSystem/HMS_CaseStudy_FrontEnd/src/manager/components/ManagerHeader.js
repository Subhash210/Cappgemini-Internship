import React, { Component,useState, useEffect } from "react";
import {
  BrowserRouter as Router,
  NavLink
} from "react-router-dom";
import authServices from "../services/auth.services";
import './ManagerHeader.css'

function ManagerHeader() {
    const [currentUser, setCurrentUser] = useState(undefined);
  
    useEffect(() => {
      const user = authServices.getCurrentUser();
  
      if (user) {
        setCurrentUser(user);
      }
    }, []);

    const logOut = () => {
      authServices.logout();
    };
  return (
    <div className="managerheader">
      <NavLink to="/managerchangepassword" className="managerchangepassword">Change Password</NavLink>
      {currentUser ? (      
        <a href="/" onClick={logOut}  className="logoutman">
          Logout
        </a>
        ) 
        : (  
            <NavLink to={"/managerlogin/*"} className="logoutman">
              Login
            </NavLink>       
        )
        }
    </div>
  )
}

export default ManagerHeader