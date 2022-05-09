import React,{useState} from 'react'
import axios from 'axios';
import ManagarInventoryNavBar from './ManagerInventoryNavBar';


function MUpdateInventory() {
    const[inventory,setInventory]=useState({        
        inventoryCode:"",    
    })
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
    const idurl="Manager/manager/getinventorybyid?inventoryCodse="+inventory.inventoryCode;
    const url="Manager/manager/updateinventory"
    function inventorysubmit(i){
        i.preventDefault(); 
        axios.get(idurl)
            .then(res=>{
                setData(res.data);
            },
           );
        
    }
    function submit(e){
        const item={
          inventoryCode:data.inventoryCode,
          inventoryType:data.inventoryType,
          inventoryName:data.inventoryName,  
          inventoryQuantity:data.inventoryQuantity
            }
        e.preventDefault();
        axios.put(url,item )
            .then(res=>{
                setMessage("Inventory Details Updated")
                setTimeout(function(){window.location.reload()},900);
            },
           );
           
        
    }
    function inventoryhandle(i){
        const newdata={...inventory}
        newdata[i.target.id]=i.target.value
        setInventory(newdata)
    }
    
    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)
    }

  return (
    <React.Fragment> 
        <ManagarInventoryNavBar/>
        <div className='backimage'>
        <div className="reservesearchbar">
            <form onSubmit={(i)=>inventorysubmit(i)}> 
                <input  className='idsearch'  onChange={(i)=>inventoryhandle(i)} id="inventoryCode" value={inventory.inventoryCode} placeholder='Inventory Code' type="text"/>
                <button className='idsearchbutton'>search</button>
            </form>
        </div>
        <div className='updatebody'> 
            <div className="container">
            <div className="title">Update Inventory</div> 
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
                        <input type="submit" value="Update"/>
                    </div>
                </form>
            </div>
        </div>
        </div>
        </div>
    </React.Fragment>
  )
}

export default MUpdateInventory