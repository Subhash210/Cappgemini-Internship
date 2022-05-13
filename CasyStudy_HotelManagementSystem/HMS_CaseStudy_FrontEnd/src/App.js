import "./App.css";
// importing components from react-router-dom package
import {
  BrowserRouter as Router,
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

import Paymenthome from "./owner/payment/Paymenthome";
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
import Unauthorize from "./components/Unauthorize";
import OwnerPrivateRoute from "./owner/components/OwnerPrivateRoute";
import RecepPrivateRoute from "./receptionist/components/RecepPrivateRoute";
import ManagerPrivateRoute from "./manager/components/ManagerPrivateRoute";
  
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
          <Route path="/recephome" element={<RecepPrivateRoute><RecepHome/></RecepPrivateRoute>} />    
          <Route path="/managerhome" element={<ManagerPrivateRoute><ManagerHome/></ManagerPrivateRoute>} />  
          <Route path="/ownerhome" element={<OwnerPrivateRoute><OwnerHome/></OwnerPrivateRoute>} /> 
          <Route path="/receppasswordupdate" element={<RecepPrivateRoute><UpdateRecepPassword/></RecepPrivateRoute>} /> 


          {/* <Route path='/order/:id' element={<PrivateRoute><CreateOrder /></PrivateRoute>} /> */}


          {/* Receptionist Routes  */}
          <Route path="/rreservationadd" element={<RecepPrivateRoute><RresAdd/></RecepPrivateRoute>}/>
          <Route path="/rresupdate" element={<RecepPrivateRoute><RresUpdate/></RecepPrivateRoute>}/>
          <Route path="/rresgetall" element={<RecepPrivateRoute><RresGetAll/></RecepPrivateRoute>}/>

          <Route path="/rguestadd" element={<RecepPrivateRoute><RGuestAdd/></RecepPrivateRoute>}/>
          <Route path='/rguestupdate' element={<RecepPrivateRoute><RGuestUpdate/></RecepPrivateRoute>}/>
          <Route path='/rguestgetall' element={<RecepPrivateRoute><RGuestGetAll/></RecepPrivateRoute>}/>
          <Route path='/rguestcheckout' element={<RecepPrivateRoute><RGuestCheckout/></RecepPrivateRoute>}/>
          <Route path='/rguestaddreserved' element={<RecepPrivateRoute><RGuestAddReserved/></RecepPrivateRoute>}/>
          <Route path='/rguestdelete' element={<RecepPrivateRoute><RGuestDelete/></RecepPrivateRoute>}/>


          <Route path="/rbillgenerate" element={<RecepPrivateRoute><RGenerateBill/></RecepPrivateRoute>}/>
          <Route path='/rgetallbills' element={<RecepPrivateRoute><RGetAllBills/></RecepPrivateRoute>}/>
          <Route path='/rprintbill' element={<RecepPrivateRoute><RPrintBill/></RecepPrivateRoute>}/>

          <Route path='/rgetrates' element={<RecepPrivateRoute><RGetRates/></RecepPrivateRoute>}/>

          <Route path="/ravailablerooms" element={<RecepPrivateRoute><RGetAvailableRooms/></RecepPrivateRoute>}/>
          <Route path="/rpayment" element={<RecepPrivateRoute><Payment/></RecepPrivateRoute>}/>

          <Route path="*" element={<Error/>}/>


        {/* MANAGER ROOM ROUTES */}
          <Route path='/maddroom' element={<ManagerPrivateRoute><MAddRoom/></ManagerPrivateRoute>}/>
          <Route path='/mgetallrooms' element={<ManagerPrivateRoute><MGetAllRooms/></ManagerPrivateRoute>}/>
          <Route path='/mdeleteroom' element={<ManagerPrivateRoute><MDeleteRoom/></ManagerPrivateRoute>}/>

          {/* MANAGER INVENTORY ROUTES */}
          <Route path='/maddinventory' element={<ManagerPrivateRoute><MAddInventory/></ManagerPrivateRoute>}/>
          <Route path='/mgetinventory' element={<ManagerPrivateRoute><MGetAllInventory/></ManagerPrivateRoute>}/>
          <Route path='/mupdateinventory' element={<ManagerPrivateRoute><MUpdateInventory/></ManagerPrivateRoute>}/>

          {/* MANAGER RATES ROUTES */}
          <Route path='/maddnewrate' element={<ManagerPrivateRoute><MAddNewRate/></ManagerPrivateRoute>}/>
          <Route path='/mgetrates' element={<ManagerPrivateRoute><MGetRates/></ManagerPrivateRoute>}/>
          <Route path='/mupdaterate' element={<ManagerPrivateRoute><MUpdateRate/></ManagerPrivateRoute>}/>

          {/* MANAGER STAFF ROUTES */}
          <Route path='/maddstaff' element={<ManagerPrivateRoute><MAddStaff/></ManagerPrivateRoute>}/>
          <Route path='/mupdatestaff' element={<ManagerPrivateRoute><MUpdateStaff/></ManagerPrivateRoute>}/>
          <Route path='/mgetallstaff' element={<ManagerPrivateRoute><MGetAllStaff/></ManagerPrivateRoute>}/>
          <Route path='/mdeletestaff' element={<ManagerPrivateRoute><MDeleteStaff/></ManagerPrivateRoute>}/>

          {/* MANAGER DETAILS ROUTES */}
          <Route path='/addreceptionist' element={<ManagerPrivateRoute><AddReceptionist/></ManagerPrivateRoute>}/>
          <Route path='/managerchangepassword' element={<ManagerPrivateRoute><UpdateManagerDetails/></ManagerPrivateRoute>}/>

       {/* OWNER DETAILS ROUTES */}
       <Route path='/oowneraddreceptionist' element={<RecepPrivateRoute><OwnerAddReceptionist/></RecepPrivateRoute>}/>
          <Route path='/oaddmanager' element={<OwnerPrivateRoute><AddManager/></OwnerPrivateRoute>}/>
          <Route path='/ochangepassword' element={<OwnerPrivateRoute><UpdateOwnerDetails/></OwnerPrivateRoute>}/>

          {/* OWNER BILL ROUTES */}
          <Route path='/ogeneratebill' element={<OwnerPrivateRoute><OGenerateBill/></OwnerPrivateRoute>}/>
          <Route path='/ogetallbills' element={<OwnerPrivateRoute><OGetAllBills/></OwnerPrivateRoute>}/>
          <Route path='/oprintbill' element={<OwnerPrivateRoute><OPrintBill/></OwnerPrivateRoute>}/>
          <Route path='/paymenthome' element={<OwnerPrivateRoute><Paymenthome/></OwnerPrivateRoute>}/>

          {/* OWNER DEPARTMENT ROUTES */}
          <Route path='/oadddepartment' element={<OwnerPrivateRoute><OAddDepartment/></OwnerPrivateRoute>}/>
          <Route path='/ogetdepartments' element={<OwnerPrivateRoute><OGetAllDepartments/></OwnerPrivateRoute>}/>

          {/* OWNER GUEST ROUTES */}
          <Route path='/oguestadd' element={<OwnerPrivateRoute><OGuestAdd/></OwnerPrivateRoute>}/>
          <Route path='/oguestupdate' element={<OwnerPrivateRoute><OGuestUpdate/></OwnerPrivateRoute>}/>
          <Route path='/oguestgetall' element={<OwnerPrivateRoute><OGuestGetAll/></OwnerPrivateRoute>}/>
          <Route path='/oguestcheckout' element={<OwnerPrivateRoute><OGuestCheckout/></OwnerPrivateRoute>}/>
          <Route path='/oguestaddreserved' element={<OwnerPrivateRoute><OGuestAddReserved/></OwnerPrivateRoute>}/>
          <Route path='/oguestdelete' element={<OwnerPrivateRoute><OGuestDelete/></OwnerPrivateRoute>}/>

          {/* OWNER INVENTORY ROUTES */}
          <Route path='/oaddinventory' element={<OwnerPrivateRoute><OAddInventory/></OwnerPrivateRoute>}/>
          <Route path='/ogetinventory' element={<OwnerPrivateRoute><OGetAllInventory/></OwnerPrivateRoute>}/>
          <Route path='/oupdateinventory' element={<OwnerPrivateRoute><OUpdateInventory/></OwnerPrivateRoute>}/>

          {/* OWNER RATES ROUTES */}
          <Route path='/oaddnewrate' element={<OwnerPrivateRoute><OAddNewRate/></OwnerPrivateRoute>}/>
          <Route path='/ogetrates' element={<OwnerPrivateRoute><OGetRates/></OwnerPrivateRoute>}/>
          <Route path='/oupdaterate' element={<OwnerPrivateRoute><OUpdateRate/></OwnerPrivateRoute>}/>

          {/* OWNER RESERVATION ROUTES */}
          <Route path='/oresupdate' element={<OwnerPrivateRoute><OResUpdate/></OwnerPrivateRoute>}/>
          <Route path='/oresgetall' element={<OwnerPrivateRoute><OResGetAll/></OwnerPrivateRoute>}/>
          <Route path='/oresadd' element={<OwnerPrivateRoute><OResAdd/></OwnerPrivateRoute>}/>

          {/* OWNER ROOM ROUTES */}
          <Route path='/oaddroom' element={<OwnerPrivateRoute><OAddRoom/></OwnerPrivateRoute>}/>
          <Route path='/ogetallrooms' element={<OwnerPrivateRoute><OGetAllRooms/></OwnerPrivateRoute>}/>
          <Route path='/odeleteroom' element={<OwnerPrivateRoute><ODeleteRoom/></OwnerPrivateRoute>}/>

          {/* OWNER STAFF ROUTES */}
          <Route path='/oaddstaff' element={<OwnerPrivateRoute><OAddStaff/></OwnerPrivateRoute>}/>
          <Route path='/oupdatestaff' element={<OwnerPrivateRoute><OUpdateStaff/></OwnerPrivateRoute>}/>
          <Route path='/ogetallstaff' element={<OwnerPrivateRoute><OGetAllStaff/></OwnerPrivateRoute>}/>
          <Route path='/odeletestaff' element={<OwnerPrivateRoute><ODeleteStaff/></OwnerPrivateRoute>}/>

          {/* AUTHORIZATION */}
          <Route path="/unauthorize" element={<Unauthorize/>}/>
       
        </Routes>
      </Router>
   
    </div>
  );
}
  
export default App;