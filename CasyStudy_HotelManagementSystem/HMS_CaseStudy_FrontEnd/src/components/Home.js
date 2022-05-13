import React from "react";
// importing Link from react-router-dom to navigate to
// different end points.
import { NavLink } from "react-router-dom";
import './home.css'
import Slider from "./Slider/Slider";
import about from './images/About.png'
import viewpoint from './images/viewpoint.png'
import maintenance from './images/maintenance.png'
import food from './images/food.png'
import hygiene from './images/hygiene.png'
import pricetag from './images/pricetag.png'
import award from './images/award.png'
import WWcoverage from './images/WWcoverage.png'
import logobrown from './images/logobrown.png'
import wifi from './images/wifi.png'
import gym from './images/gym.png'
import spa from './images/spa.png'
import transport from './images/transport.png'
import game from './images/game.png'
import breakfast from './images/breakfast.png'


const Home = () => {
return (
	<React.Fragment>	
	<div className='hotelName' id="hotelName" ><img src={logobrown} className="logobrown" alt="logo"/><div className="babaihotelName">BABAI Hotel</div></div>
	<nav>
	<ul className='navBar'>
		<li className='homeli'>
			{/* Endpoint to route to Home component */}
			<a className='link' href="#hotelName">Home</a>
		</li>
		<li className='homeli'>
			{/* Endpoint to route to Receptionist component */}
			<NavLink to="/receptionistlogin" className='link'>Receptionist Login</NavLink>
		</li>
		<li className='homeli'>
			{/* Endpoint to route to Manager component */}
			<NavLink to="/managerlogin" className='link'>Manager Login</NavLink>
		</li>
        <li className='homeli'>
            {/* Endpoint to route to Owner component */}
		    <NavLink to="/ownerlogin" className='link'>Owner Login</NavLink>
        </li>
	</ul>
	</nav>
	<div className="slider"><Slider/></div>
	<div className="testimonialhome">
		<div className="testmonialtags"><img src={pricetag} className="testimoniallogos" alt="privetag" /><br/><h4>Competetive Pricing</h4><p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form.</p></div>
		<div className="testmonialtags"><img src={award} className="testimoniallogos" alt="award"/><br/><h4>Award winning service</h4><p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form.</p></div>
		<div className="testmonialtags"><img src={WWcoverage} className="testimoniallogos" alt="coverage"/><br/><h4>WorldWide Coverage</h4><p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form.</p></div>
	</div>
	<div className="corefeatures">
		<div className="corelogos">
			<img src={wifi} alt='wifi' className="corelogoimg"/><br/>
			Wifi
		</div>
		<div className="corelogos">
		<img src={gym} alt='gym' className="corelogoimg"/><br/>
			Gym
		</div>
		<div className="corelogos">
		<img src={spa} alt='spa' className="corelogoimg"/><br/>
			Spa
		</div>
		<div className="corelogos">
		<img src={transport} alt='transport' className="corelogoimg"/><br/>
			Transport
		</div>
		<div className="corelogos">
		<img src={breakfast} alt='breakfast' className="corelogoimg"/><br/>
			Breakfast
		</div>
		<div className="corelogos">
		<img src={game} alt='game' className="corelogoimg"/><br/>
			Game
		</div>
	</div>
	<div className="abouthotel">
	<h1>About</h1>
	<div className="gridabout">	
	   <div><div className="imagecenter"><img src={viewpoint} className="abouticons" alt="viewpoint"/><h4>View Point</h4></div>
		<p>BABAI Hotel had started its base in vijayawada with classic look and attractive, it expanded drastically through the years and stated its stability as a grand hotel of vijayawada.</p></div>
		<div><div className="imagecenter"><img src={maintenance} className="abouticons" alt="maintainance"/><h4>Maintenance</h4></div>
		<p>is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p></div>
		<img src={about} className='aboutimage' alt="about"></img>
		<div><div className="imagecenter"><img src={food} className="abouticons" alt="food"/><h4>Food</h4></div><p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form.</p></div>
		<div><div className="imagecenter"><img src={hygiene} className="abouticons" alt="hygine"/><h4>Hygiene</h4></div><p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form.</p></div>
	</div>
	</div>
	
	<footer id="footer">
		<div>
			<p>BABAI HOTEL</p>
		</div>
		<div>
			<p>Project Doneby: Subhash</p>
		</div>
    </footer>
	</React.Fragment>
);
};

export default Home;