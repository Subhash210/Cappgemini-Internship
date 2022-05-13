import { Navigate } from "react-router-dom";
import authService from "../services/auth.service";


const OwnerPrivateRoute=({ children }) =>{
    const user =authService.getCurrentUser();
     return user?children:<Navigate to="/unauthorize" />;
    };
 
 export default OwnerPrivateRoute;