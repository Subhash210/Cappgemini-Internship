import React,{useState} from 'react';
import {useNavigate} from 'react-router-dom';
import AuthService from './services/auth.services';
import userlogin from './images/managerlogin.png'



function ManagerLogin() {
 
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
                    navigate("/managerhome");
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
            <body className="managerbody">
                <div className="wrapper fadeInDown">
                    <div id="formContent">    
                    <h2 className="active">Manager LogIn </h2>
                    <div className="fadeIn first">
                    <img src={userlogin} id="icon" alt="User Icon" />
                    </div>
                        <form   onSubmit={handleLogin}>
                        {error && <div className='loginerror'>{error}</div>}
                            <input onChange={(e)=>handle(e)}  value={data.username} id="username" type="text" className="fadeIn second" name="login" placeholder="Username"/>
                            <input onChange={(e)=>handle(e)} value={data.password} type="password" id="password" className="fadeIn third" name="login" placeholder="password"/>
                            <input type="submit" className="fadeIn fourth" value="Log In"/>
                        </form>    
                    <div id="formFooter">
                    </div>
                    </div>
                </div>   
            </body>
        </React.Fragment>
  )
}

export default ManagerLogin;