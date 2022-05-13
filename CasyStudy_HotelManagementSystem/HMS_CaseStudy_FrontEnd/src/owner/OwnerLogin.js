import React,{useState} from 'react';
import {useNavigate} from 'react-router-dom';
import AuthService from './services/auth.service';
import userlogin from './images/ownerlogin.png'
import '../components/Login.css'


function OwnerLogin() {
 
    const[error,setError]=useState(null);
    const[data,setData]=useState({
        username:"",
        password:""
    })

    const navigate =  useNavigate();

    const handleLogin = async  (e)=>{
        e.preventDefault();
        try{
            await AuthService.login(data.username,data.password).then(
                ()=>{
                    navigate("/ownerhome");
                    window.location.reload();
                },
                (error)=>{
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
     <body class="ownerbody">
    <div class="wrapper fadeInDown">
        <div id="formContent">    
         <h2 class="active">Owner LogIn </h2>
        <div class="fadeIn first">
          <img src={userlogin} id="icon" alt="User Icon" />
        </div>
            <form   onSubmit={handleLogin}>
            {error && <div className='loginerror'>{error}</div>}
               <input onChange={(e)=>handle(e)}  value={data.username} id="username" type="text" class="fadeIn second" name="login" placeholder="Username" required/>
               <input onChange={(e)=>handle(e)} value={data.password} type="password" id="password" class="fadeIn third" name="login" placeholder="password" required/>
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

export default OwnerLogin