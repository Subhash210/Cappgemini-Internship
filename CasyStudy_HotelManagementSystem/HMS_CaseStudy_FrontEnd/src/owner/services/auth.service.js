import axios from "axios";



class AuthService {

login(username, password) {
  const API_URL = "Owner/owner/authenticate?password="+password+"&username="+username;
    return axios
        .post(API_URL , {
        username,
        password
        })
        .then(response => {
        const token=response.data;
        localStorage.setItem("SavedToken",token);

        return response.data;
        });
    }
    
  logout(){
    localStorage.removeItem("SavedToken");
  }

  getCurrentUser() {
    return localStorage.getItem('SavedToken');
  };
}

export default new AuthService();