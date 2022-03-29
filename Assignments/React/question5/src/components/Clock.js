import React,{ useState } from 'react'
import './Clock.css'
import C from './clock.png'
import calender from './calendar.png'


function Clock() {
  let time = new Date().toLocaleTimeString();
  let date= new Date().toDateString();
  const [ctime,setCtime]=useState(time)

  const updateTime=()=>{
    time=new Date().toLocaleTimeString();
    setCtime(time)
  }
  setInterval(updateTime,1000)

  const [isOpen,setIsOpen]=useState(false);
  const toggle=()=>setIsOpen(!isOpen)

  return (
    <div>
      <section id='view'>
        <h1><img src={C} className='Clock'></img>Digital Clock</h1>
        <label className='switch'>
          <input type="checkbox" onClick={toggle}/>
          <span className='slider round'></span>
        </label>
        <img src={calender} className='calendar'/>
        <div id='time'><div id='timetext'>{ctime}</div></div>
        <div id='datetext'>{isOpen ? date:''}</div>
      </section>
    </div>
  )
}

export default Clock