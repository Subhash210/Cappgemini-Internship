import React, { Component,useState, useEffect } from "react";
import {
  BrowserRouter as Router,
  NavLink,
  Switch,
  Route,
  Routes
} from "react-router-dom";
import OwnerHeader from "./OwnerHeader";
import './OwnerHome.css'
import emailjs from '@emailjs/browser';
import reserve from '../images/reserve.png'
import guest from '../images/guest.png'
import bill from '../images/bill.png'
import rooms1 from '../images/rooms2.png'
import payment from '../images/payment.png'
import rates1 from '../images/rates1.png'
import inventory from '../images/inventory.png'
import staff from '../images/staff.png'
import department from '../images/department.png'
import image1 from '../images/image1.jpg'
import image2 from '../images/image2.jpg'
import image3 from '../images/image3.jpg'
import image4 from'../images/image4.jpg'

function OwnerHome() {

  const[message,setMessage]=useState(null);
  const sendmail = (e) => {
    e.preventDefault();

    emailjs.sendForm('service_tqjy03g', 'template_ibrww7i', e.target, 'stWWakmH7XChiKhze')
      .then((result) => {
        setMessage("Your Message is recieved the support will contact you in 18 hours");
        setTimeout(function(){window.location.reload()},1000);
      }, (error) => {
          console.log(error.text);
      });e.target.reset();
  };

  
  return (
    <div className="backgroundown">
     
     <div className="parallaxown"> <OwnerHeader/></div>
     <div className="quotationown">Hospitality is almost impossible to teach. It's all about hiring the right people.</div>
      <div className="betweenbar">
        <ul>
          <li><a href="#eventheading">Events</a></li>
          <li><a href="#gallery">Gallery</a></li>
          <li><a href="#services">Services</a></li>
          <li><a href="#support">Support</a></li>
        </ul>
      </div>
    
   
  <div className="mappingown">  
    {/* Endpoint to route to owner component */}
   <NavLink to="/oresadd" className="redirectlink reservationown" ><img src={reserve} id='logos'/><br/><h4>Reservation</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
   <NavLink to="/oguestadd" className="redirectlink guestown" ><img src={guest} id='logos'/><br/><h4> Guest</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
   <NavLink to="/oaddroom" className="redirectlink roomsown" ><img src={rooms1} id='logos'/><br/><h4>Rooms</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
   <NavLink to="/ogeneratebill" className="redirectlink billown"><img src={bill} id='logos'/><br/><h4>Bill</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
   <NavLink to="/oaddnewrate" className="redirectlink ratesown" ><img src={rates1} id='logos'/><br/><h4>Rates</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
   <NavLink to="/oaddinventory" className="redirectlink inventoryown" ><img src={inventory} id='logos'/><br/><h4>Inventory</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>
   <NavLink to="/oaddstaff" className="redirectlink staffown" ><img src={staff} id='logos'/><br/><h4>Staff</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>
   <NavLink to="/paymenthome" className="redirectlink paymentown" id="payment" ><img src={payment} id='logos'/><br/><h4>Payment</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
   <NavLink to="/oadddepartment" className="redirectlink departmentown" ><img src={department} id='logos'/><br/><h4>Department</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>
   <NavLink to="/oaddmanager" className="redirectlink addmanager" ><img src={department} id='logos'/><br/><h4>Recruit</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>
  </div>
  <div className="eventheading" id="eventheading">Events</div>
  <div className="eventshome" id="event">
    <div className="event">
      <div className="datelogo">02 NOV</div>
      <div className="eventcontent">
        <h4>Annual Day</h4><p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.</p>
      </div>
    </div>
    <div className="event">
    <div className="datelogo">22 Nov</div>
    <div className="eventcontent">
        <h4>Silver Jubilee</h4><p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.</p>
      </div>
    </div>
    <div className="event">
    <div className="datelogo">29 June</div>
    <div className="eventcontent">
        <h4>Fund Raiser</h4><p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.</p>
      </div>
    </div>
    <div className="event">
    <div className="datelogo">29 DEC</div>
    <div className="eventcontent">
        <h4>Sponserships</h4><p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.</p>
      </div>
    </div>
  </div>

  {/* Gallery */}
  <div id="gallery">Gallery</div>
  <div className="imagegallery">
    <img src={image1} className="imagesgal" alt="images"/>
    <img src={image2} className="imagesgal" alt="images"/>
    <img src={image3} className="imagesgal" alt="images"/>
    <img src={image4} className="imagesgal" alt="images"/>
  </div>

  {/* Services */}
 
  <div id="services" className="services">
        Services
      </div>
      <section>
      <div className="row">
        <div className="column">
          <div className="card">
            <div className="icon-wrapper">
              <i className="fas fa-hammer"></i>
            </div>
            <h3>Rooms</h3>
            <p>
              Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.
            </p>
          </div>
        </div>
        <div className="column">
          <div className="card">
            <div className="icon-wrapper">
              <i className="fas fa-brush"></i>
            </div>
            <h3>Food</h3>
            <p>
              Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.
            </p>
          </div>
        </div>
        <div className="column">
          <div className="card">
            <div className="icon-wrapper">
              <i className="fas fa-wrench"></i>
            </div>
            <h3>Laundry</h3>
            <p>
              Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.
            </p>
          </div>
        </div>
        <div className="column">
          <div className="card">
            <div className="icon-wrapper">
              <i className="fas fa-truck-pickup"></i>
            </div>
            <h3>Functions</h3>
            <p>
              Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.
            </p>
          </div>
        </div>
        <div className="column">
          <div className="card">
            <div className="icon-wrapper">
              <i className="fas fa-broom"></i>
            </div>
            <h3>Parties</h3>
            <p>
              Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.
            </p>
          </div>
        </div>
        <div className="column">
          <div className="card">
            <div className="icon-wrapper">
              <i className="fas fa-plug"></i>
            </div>
            <h3>DanceShow</h3>
            <p>
              Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam
              consequatur necessitatibus eaque.
            </p>
          </div>
        </div>
      </div>
    </section>
    {/* Support */}
    <div className="contains" id="support">
    <div className="contents">
      <div className="left-side">
        <div className="address details">
          <i className="fas fa-map-marker-alt"></i>
          <div className="topic">Address</div>
          <div className="text-one">Surkhet, NP12</div>
          <div className="text-two">Birendranagar 06</div>
        </div>
        <div className="phone details">
          <i className="fas fa-phone-alt"></i>
          <div className="topic">Phone</div>
          <div className="text-one">+0098 9893 5647</div>
          <div className="text-two">+0096 3434 5678</div>
        </div>
        <div className="email details">
          <i className="fas fa-envelope"></i>
          <div className="topic">Email</div>
          <div className="text-one">codinglab@gmail.com</div>
          <div className="text-two">info.codinglab@gmail.com</div>
        </div>
      </div>
      <div className="right-side">
        <div className="topic-text">Send us a message</div>
        <p>If you have any work from me or any types of quries related to my tutorial, you can send me message from here. It's my pleasure to help you.</p>
      <form action="#" onSubmit={(e)=>sendmail(e)}>
        <div className="input-box" >
          <input type="text" placeholder="Enter your name" name="name"/>
        </div>
        <div className="input-box">
          <input type="text" placeholder="Enter issue" name="issue"/>
        </div>
        <div className="input-box message-box">
        <input type="text" placeholder="Eloborate issue" name="message"/>
        </div>
        {message && <div className='message'>{message}</div>}
        <div className="resclick">
          <input type="submit"  value='submit'/>
        </div>
      </form>
    </div>
    </div>
  </div>
</div>
  )
}

export default OwnerHome
