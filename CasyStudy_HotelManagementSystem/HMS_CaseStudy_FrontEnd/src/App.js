import "./App.css";
// importing components from react-router-dom package
import {
  BrowserRouter as Router,
  Link,
  Switch,
  Route,
  Routes
} from "react-router-dom";
import Home from "./components/Home";
import OwnerLogin from "./owner/OwnerLogin";
import RecepLogin from "./receptionist/RecepLogin";
import ManagerLogin from "./manager/ManagerLogin";

import RecepHome from "./receptionist/components/RecepHome";
import ManagerHome from "./manager/components/ManagerHome";
import OwnerHome from "./owner/components/OwnerHome";

import Payment from "./receptionist/payment/Payment";
import RresAdd from "./receptionist/reservation/RresAdd";
import RGuestAdd from "./receptionist/guest/RGuestAdd";
import RGuestUpdate from "./receptionist/guest/RGuestUpdate";
import RGuestGetAll from "./receptionist/guest/RGuestGetAll";
import RGuestCheckout from "./receptionist/guest/RGuestCheckout";
import RGuestAddReserved from "./receptionist/guest/RGuestAddReserved";
import RGuestDelete from "./receptionist/guest/RGuestDelete";
import RGenerateBill from "./receptionist/bill/RGenerateBill";
import RGetAllBills from "./receptionist/bill/RGetAllBills";
import RPrintBill from "./receptionist/bill/RPrintBill";
import RGetAvailableRooms from "./receptionist/rooms/RGetAvailableRooms";
import RresUpdate from "./receptionist/reservation/RresUpdate";
import RresGetAll from "./receptionist/reservation/RresGetAll";
import RGetRates from "./receptionist/rates/RGetRates";
import Error from './components/Error'

import MAddRoom from "./manager/rooms/MAddRoom";
import MGetAllRooms from "./manager/rooms/MGetAllRooms";
import MDeleteRoom from "./manager/rooms/MDeleteRoom";
import MAddInventory from "./manager/inventory/MAddInventory";
import MGetAllInventory from "./manager/inventory/MGetAllInventory";
import MUpdateInventory from "./manager/inventory/MUpdateInventory";
import MAddNewRate from "./manager/rates/MAddNewRate";
import MGetRates from "./manager/rates/MGetRates";
import MUpdateRate from "./manager/rates/MUpdateRate";
import MAddStaff from "./manager/staff/MAddStaff";
import MDeleteStaff from "./manager/staff/MDeleteStaff";
import MGetAllStaff from "./manager/staff/MGetAllStaff";
import MUpdateStaff from "./manager/staff/MUpdateStaff";
import AddReceptionist from "./manager/recruitment/AddReceptionist";
import UpdateManagerDetails from "./manager/recruitment/UpdateManagerDetails";

import OwnerAddReceptionist from "./owner/recruitment/OwnerAddReceptionist";
import AddManager from "./owner/recruitment/AddManager";
import UpdateOwnerDetails from "./owner/recruitment/UpdateOwnerDetails";
import OGenerateBill from "./owner/bill/OGenerateBill";
import OGetAllBills from "./owner/bill/OGetAllBills";
import OPrintBill from "./owner/bill/OPrintBill";
import OGetAllDepartments from "./owner/department/OGetAllDepartments";
import OAddDepartment from "./owner/department/OAddDepartment";
import OGuestAdd from "./owner/guest/OGuestAdd";
import OGuestUpdate from "./owner/guest/OGuestUpdate";
import OGuestGetAll from "./owner/guest/OGuestGetAll";
import OGuestCheckout from "./owner/guest/OGuestCheckout";
import OGuestAddReserved from "./owner/guest/OGuestAddReserved";
import OGuestDelete from "./owner/guest/OGuestDelete";
import OAddInventory from "./owner/inventory/OAddInventory";
import OGetAllInventory from "./owner/inventory/OGetAllInventory";
import OUpdateInventory from "./owner/inventory/OUpdateInventory";
import OAddNewRate from "./owner/rates/OAddNewRate";
import OGetRates from "./owner/rates/OGetRates";
import OUpdateRate from "./owner/rates/OUpdateRate";
import OResAdd from "./owner/reservation/OResAdd";
import OResGetAll from "./owner/reservation/OResGetAll";
import OResUpdate from "./owner/reservation/OResUpdate";
import OAddRoom from "./owner/rooms/OAddRoom";
import OGetAllRooms from "./owner/rooms/OGetAllRooms";
import ODeleteRoom from "./owner/rooms/ODeleteRoom";
import OAddStaff from "./owner/staff/OAddStaff";
import OUpdateStaff from "./owner/staff/OUpdateStaff";
import OGetAllStaff from "./owner/staff/OGetAllStaff";
import ODeleteStaff from "./owner/staff/ODeleteStaff";
import UpdateRecepPassword from "./receptionist/components/UpdateRecepPassword";

  
function App() {

  return (
    <div>
  
      {/* This is the alias of BrowserRouter i.e. Router */}
      <Router>
        <Routes>
          <Route path="/" element={<Home/>} />        
          <Route path="/receptionistlogin/*" element={<RecepLogin/>} />               
          <Route path="/managerlogin/*" element={<ManagerLogin/>} />
          <Route path="/ownerlogin/*" element={<OwnerLogin/>} />  
          <Route path="/recephome" element={<RecepHome/>} />    
          <Route path="/managerhome" element={<ManagerHome/>} />  
          <Route path="/ownerhome" element={<OwnerHome/>} /> 
          <Route path="/receppasswordupdate" element={<UpdateRecepPassword/>} /> 


          {/* Receptionist Routes  */}
          <Route path="/rreservationadd" element={<RresAdd/>}/>
          <Route path="/rresupdate" element={<RresUpdate/>}/>
          <Route path="/rresgetall" element={<RresGetAll/>}/>

          <Route path="/rguestadd" element={<RGuestAdd/>}/>
          <Route path='/rguestupdate' element={<RGuestUpdate/>}/>
          <Route path='/rguestgetall' element={<RGuestGetAll/>}/>
          <Route path='/rguestcheckout' element={<RGuestCheckout/>}/>
          <Route path='/rguestaddreserved' element={<RGuestAddReserved/>}/>
          <Route path='/rguestdelete' element={<RGuestDelete/>}/>


          <Route path="/rbillgenerate" element={<RGenerateBill/>}/>
          <Route path='/rgetallbills' element={<RGetAllBills/>}/>
          <Route path='/rprintbill' element={<RPrintBill/>}/>

          <Route path='/rgetrates' element={<RGetRates/>}/>

          <Route path="/ravailablerooms" element={<RGetAvailableRooms/>}/>
          <Route path="/rpayment" element={<Payment/>}/>

          <Route path="*" element={<Error/>}/>


        {/* MANAGER ROOM ROUTES */}
          <Route path='/maddroom' element={<MAddRoom/>}/>
          <Route path='/mgetallrooms' element={<MGetAllRooms/>}/>
          <Route path='/mdeleteroom' element={<MDeleteRoom/>}/>

          {/* MANAGER INVENTORY ROUTES */}
          <Route path='/maddinventory' element={<MAddInventory/>}/>
          <Route path='/mgetinventory' element={<MGetAllInventory/>}/>
          <Route path='/mupdateinventory' element={<MUpdateInventory/>}/>

          {/* MANAGER RATES ROUTES */}
          <Route path='/maddnewrate' element={<MAddNewRate/>}/>
          <Route path='/mgetrates' element={<MGetRates/>}/>
          <Route path='/mupdaterate' element={<MUpdateRate/>}/>

          {/* MANAGER STAFF ROUTES */}
          <Route path='/maddstaff' element={<MAddStaff/>}/>
          <Route path='/mupdatestaff' element={<MUpdateStaff/>}/>
          <Route path='/mgetallstaff' element={<MGetAllStaff/>}/>
          <Route path='/mdeletestaff' element={<MDeleteStaff/>}/>

          {/* MANAGER DETAILS ROUTES */}
          <Route path='/addreceptionist' element={<AddReceptionist/>}/>
          <Route path='/managerchangepassword' element={<UpdateManagerDetails/>}/>

       {/* OWNER DETAILS ROUTES */}
       <Route path='/oowneraddreceptionist' element={<OwnerAddReceptionist/>}/>
          <Route path='/oaddmanager' element={<AddManager/>}/>
          <Route path='/ochangepassword' element={<UpdateOwnerDetails/>}/>

          {/* OWNER BILL ROUTES */}
          <Route path='/ogeneratebill' element={<OGenerateBill/>}/>
          <Route path='/ogetallbills' element={<OGetAllBills/>}/>
          <Route path='/oprintbill' element={<OPrintBill/>}/>

          {/* OWNER DEPARTMENT ROUTES */}
          <Route path='/oadddepartment' element={<OAddDepartment/>}/>
          <Route path='/ogetdepartments' element={<OGetAllDepartments/>}/>

          {/* OWNER GUEST ROUTES */}
          <Route path='/oguestadd' element={<OGuestAdd/>}/>
          <Route path='/oguestupdate' element={<OGuestUpdate/>}/>
          <Route path='/oguestgetall' element={<OGuestGetAll/>}/>
          <Route path='/oguestcheckout' element={<OGuestCheckout/>}/>
          <Route path='/oguestaddreserved' element={<OGuestAddReserved/>}/>
          <Route path='/oguestdelete' element={<OGuestDelete/>}/>

          {/* OWNER INVENTORY ROUTES */}
          <Route path='/oaddinventory' element={<OAddInventory/>}/>
          <Route path='/ogetinventory' element={<OGetAllInventory/>}/>
          <Route path='/oupdateinventory' element={<OUpdateInventory/>}/>

          {/* OWNER RATES ROUTES */}
          <Route path='/oaddnewrate' element={<OAddNewRate/>}/>
          <Route path='/ogetrates' element={<OGetRates/>}/>
          <Route path='/oupdaterate' element={<OUpdateRate/>}/>

          {/* OWNER RESERVATION ROUTES */}
          <Route path='/oresupdate' element={<OResUpdate/>}/>
          <Route path='/oresgetall' element={<OResGetAll/>}/>
          <Route path='/oresadd' element={<OResAdd/>}/>

          {/* OWNER ROOM ROUTES */}
          <Route path='/oaddroom' element={<OAddRoom/>}/>
          <Route path='/ogetallrooms' element={<OGetAllRooms/>}/>
          <Route path='/odeleteroom' element={<ODeleteRoom/>}/>

          {/* OWNER STAFF ROUTES */}
          <Route path='/oaddstaff' element={<OAddStaff/>}/>
          <Route path='/oupdatestaff' element={<OUpdateStaff/>}/>
          <Route path='/ogetallstaff' element={<OGetAllStaff/>}/>
          <Route path='/odeletestaff' element={<ODeleteStaff/>}/>

         
       
        </Routes>
      </Router>
   
    </div>
  );
}
  
export default App;