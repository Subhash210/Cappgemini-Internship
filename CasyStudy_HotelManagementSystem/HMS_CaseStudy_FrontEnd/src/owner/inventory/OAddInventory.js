import React,{useState} from 'react';
import axios from 'axios';
import OwnerInventoryNavBar from './OwnerInventoryNavBar';

function OAddInventory() {
    const url="Owner/owner/inventory/addinventory";
    const[message , setMessage] = useState();
    const[data,setData]=useState({
        inventoryCode:"",
        inventoryType:"",
        inventoryName:"",
        inventoryQuantity:""
    })
    axios.interceptors.request.use(
        config => {
        config.headers.authorization = "Bearer " + localStorage.getItem("SavedToken");
        return config;
        },
        error => {
        return Promise.reject(error);
        });
    
    function submit(e){
        const item={
            inventoryCode:data.inventoryCode,
            inventoryType:data.inventoryType,
            inventoryName:data.inventoryName,  
            inventoryQuantity:data.inventoryQuantity
            }
        e.preventDefault();
        axios.post(url,item )
            .then(res=>{
                setMessage("Inventory Added")
                setTimeout(function(){window.location.reload()},900);
            },
           );
           window.location.reload();
        
    }

    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)
    }
  return (
    <React.Fragment> 
        <OwnerInventoryNavBar/>
        <div className='body'>  
        <div className="container">
        <div className="title">New Inventory</div>
        <div  className='content'> 
         
            <form onSubmit={(e)=>submit(e)}>
            <div className="user-details"> 
                <div className="input-box"><input onChange={(e)=>handle(e)} id="inventoryCode" value={data.inventoryCode} placeholder='Inventory Code' type="text" required/></div>
                <div className="input-box"><input onChange={(e)=>handle(e)} id="inventoryType" value={data.inventoryType} placeholder='Inventory Type' type="text" required/></div>
                <div className="input-box"><input onChange={(e)=>handle(e)} id="inventoryName" value={data.inventoryName} placeholder='Inventory Name' type="text" required/></div>
                <div className="input-box"><input onChange={(e)=>handle(e)} id="inventoryQuantity" value={data.inventoryQuantity} placeholder='Inventory Quantity' type="number" required/></div>
            </div>
            {message && <div className='message'>{message}</div>}
            <div className="resclick">
            <input type="submit" value="Add"/>
            </div>
            </form>
        </div>
        </div>
        </div>
    </React.Fragment>
  )
}

export default OAddInventory;