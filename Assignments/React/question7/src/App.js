import './App.css';
import React, { useState } from 'react';
import useRequest from './hooks/useRequest';


// React toastify It is Actually a Main Container 
import { ToastContainer } from 'react-toastify';


// Components
import CurrentWeather from './components/CurrentWeather';
import Forecast from './components/Forecast';
import Search from './components/Search';

function App() {
  const [searchResult, setSearchResult] = useState('London');
   // https://www.weatherapi.com/
   //http://api.weatherapi.com/v1/current.json?key=fb9168504fdc42a4a2d204156222503&q=London&aqi=no

   const url = `http://api.weatherapi.com/v1/forecast.json?key=${process.env.REACT_APP_WEATHER_KEY}&q=${searchResult}&days=10&aqi=yes&alerts=no`;
  const { data } = useRequest(url);//We just need data so we are destructring out hook
//Using Fake Data too in case the API Doesn't Work

  // https://www.weatherapi.com/
 //const data = fakeData;

  return (
    <div>
      <ToastContainer />
      <h2 style={{ margin: '30px 0px' }}>WeatherApp</h2>
      <Search setSearchResults={setSearchResult} /> 
     
      {Object.keys(data).length !== 0 && ( 
        <>
          <CurrentWeather data={data} />
          <Forecast data={data.forecast} />
        </>
      )}
    </div>
  );
}

export default App;
