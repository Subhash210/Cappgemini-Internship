import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, NavLink, Route, Routes} from 'react-router-dom'
import Home from './components/Home'
import Project from './components/Project';
import Services from './components/Services';
import Contacts from './components/Contacts';

function App() {
  return (
    <div className="App">
      <Router>
        <div className='links'>
          <ul>
            <li className='L1'><NavLink to='/home' style={{textDecoration:"none"}}>Home</NavLink></li>
            <li className='L2'><NavLink to='/project' style={{textDecoration:"none"}}>Projects</NavLink></li>
            <li className='L3'><NavLink to='/service' style={{textDecoration:"none"}}>Services</NavLink></li>
            <li className='L4'><NavLink to='/contact' style={{textDecoration:"none"}}>Contacts</NavLink></li>
          </ul>
        </div>
        
        
        
        
          <Routes>
            <Route path='/home' element={<Home/>}>Home</Route>
            <Route path='/project' element={<Project/>}>Home</Route>
            <Route path='/service' element={<Services/>}>Home</Route>
            <Route path='/contact' element={<Contacts/>}>Home</Route>
          </Routes>
      </Router>
    </div>
  );
}

export default App;
