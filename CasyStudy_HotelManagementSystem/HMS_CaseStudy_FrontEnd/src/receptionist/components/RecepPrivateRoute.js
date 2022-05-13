import { Navigate } from "react-router-dom";
import authServices from "../services/auth.services";


const RecepPrivateRoute=({ children }) =>{
    const user =authServices.getCurrentUser();
     return user?children:<Navigate to="/unauthorize" />;
    };
 
 export default RecepPrivateRoute;