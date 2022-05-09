import React,{useState} from 'react';
import {useNavigate} from 'react-router-dom';
import authService from './services/auth.services';
import userlogin from './images/userlogin.png'
import '../components/Login.css'

function RecepLogin() {
    const[data,setData]=useState({
        username:"",
        password:""
    })
    const[error,setError]=useState(null);
    const navigate =  useNavigate();
    const handleLogin = async  (e)=>{
        e.preventDefault();
        try{
            await authService.login(data.username,data.password).then(
                ()=>{
                    navigate("/recephome");
                    window.location.reload();
                },
                (error)=>{
                    console.log(error);
                    setError("Incorrect credentials");
                }
            )
        }
        catch(err){
            console.log(err);
        }
    }
    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)    
    }

    return (
    <React.Fragment>  
        <body class="recepbody">
    <div class="wrapper fadeInDown">
        <div id="formContent">    
         <h2 class="active">Receptionist LogIn </h2>
        <div class=" first">
          <img src={userlogin} id="icon" alt="User Icon" />
        </div>
            <form   onSubmit={handleLogin} >
                {error && <div className='loginerror'>{error}</div>}
               <input onChange={(e)=>handle(e)}  value={data.username} id="username" type="text" class="fadeIn second" name="login" placeholder="Username"/>
               <input onChange={(e)=>handle(e)} value={data.password} type="password" id="password" class="fadeIn third" name="login" placeholder="password"/>
               <input type="submit" class="fadeIn fourth" value="Log In"/>
            </form>    
         <div id="formFooter">
         </div>
        </div>
    </div>   
    </body>
    </React.Fragment>
  )
}

export default RecepLogin