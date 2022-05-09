import React from "react";
import {
    NavLink

} from "react-router-dom";
import RecepHeader from "./RecepHeader";
import './RecepHome.css'
import reserve from '../images/reserve.png'
import guest from '../images/guest.png'
import bill from '../images/bill.png'
import rooms from '../images/rooms2.png'
import payment from '../images/payment.png'
import rates from '../images/rates.png'
import image1 from '../images/image1.jpg'
import image2 from '../images/image2.jpg'
import image3 from '../images/image3.jpg'
import image4 from'../images/image4.jpg'

function RecepHome() {



  return (
  <div className="background">
     
      <div className="parallax"> <RecepHeader/></div>
      <div className="betweenbar">
        <ul>
          <li><a href="#eventheading">Events</a></li>
          <li><a href="#gallery">Gallery</a></li>
          <li><a href="#sectionheading">Services</a></li>
          <li><a href="#support">Support</a></li>
        </ul>
      </div>
      
     
    <div className="mapping">  
			{/* Endpoint to route to receptionist component */}
		 <NavLink to="/rreservationadd" className="redirectlink reservation" ><img src={reserve} id='logos' alt="logos" /><br/><h4>Reservation</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/rguestadd" className="redirectlink guest" ><img src={guest} id='logos' alt="logos"/><br/><h4> Guest</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/rbillgenerate" className="redirectlink bill" ><img src={bill} id='logos' alt="logos"/><br/><h4> Generate Bill</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/ravailablerooms" className="redirectlink rooms"><img src={rooms} id='logos' alt="logos"/><br/><h4> Available Rooms</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/rpayment" className="redirectlink payment" id="payment" ><img src={payment} id='logos' alt="logos"/><br/><h4>Payment</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/rgetrates" className="redirectlink rates" ><img src={rates} id='logos' alt="logos"/><br/><h4>Rates</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>
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

  <section>
      <div className="row">
        <h2 id="sectionheading">Services</h2>
      </div>
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
      <form action="#">
        <div className="input-box">
          <input type="text" placeholder="Enter your name"/>
        </div>
        <div className="input-box">
          <input type="text" placeholder="Enter your email"/>
        </div>
        <div className="input-box message-box">
          
        </div>
        <div className="button">
          <input type="button" value="Send Now" />
        </div>
      </form>
    </div>
    </div>
  </div>
  </div>
  )
}

export default RecepHome