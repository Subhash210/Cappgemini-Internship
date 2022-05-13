import React,{useState} from "react";
import {NavLink} from "react-router-dom";
import ManagerHeader from "./ManagerHeader";
import './ManagerHome.css'
import emailjs from '@emailjs/browser';
import staff from '../images/staff.png'
import rooms1 from '../images/rooms2.png'
import inventory from '../images/inventory.png'
import rates1 from '../images/rates1.png'
import recruitment from '../images/recruitment.png'
import imageman1 from '../images/imageman1.jpeg'
import imageman2 from '../images/imageman2.jpeg'
import imageman3 from '../images/imageman3.jpeg'
import imageman4 from '../images/imageman4.jpeg'

   
function ManagerHome() {

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
    <div className="backgroundman">
     
      <div className="parallaxman"> <ManagerHeader/></div>
      <div className="quotationown">Keep your egos in check, and let the people who work for you shine. Because they're the people who know our customers best, the people we depend on to lead the way. It's no longer Do as I say. It's Do as I do.</div>
      <div className="betweenbar">
        <ul>
          <li><a href="#eventheading">Events</a></li>
          <li><a href="#gallery">Gallery</a></li>
          <li><a href="#sectionheading">Services</a></li>
          <li><a href="#support">Support</a></li>
        </ul>
      </div>
      
     
    <div className="mappingman">  
			{/* Endpoint to route to receptionist component */}
		 <NavLink to="/maddroom" className="redirectlinkman roomsman" ><img src={rooms1} id='logos' alt="logos"/><br/><h4>Rooms</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/maddinventory" className="redirectlinkman inventoryman" ><img src={inventory} id='logos' alt="logos"/><br/><h4> Inventory</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/maddnewrate" className="redirectlinkman ratesman"><img src={rates1} id='logos' alt="logos"/><br/><h4>Rates</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/maddstaff" className="redirectlinkman staffman" ><img src={staff} id='logos' alt="logos"/><br/><h4>Staff</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
     <NavLink to="/addreceptionist" className="redirectlinkman recruitman" ><img src={recruitment} id='logos' alt="logos"/><br/><h4>Recruit</h4><p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p></NavLink>	
    </div>

    <div className="galleryman">
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
    <img src={imageman1} className="imagesgalman" alt=""/>
    <img src={imageman2} className="imagesgalman"alt=""/>
    <img src={imageman3} className="imagesgalman"alt=""/>
    <img src={imageman4} className="imagesgalman"alt=""/>
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

export default ManagerHome
