import React from 'react';
//Here I am using styled Componenet (npm -i styled-components)
import styled from 'styled-components';
//We are making Use of Moment here 
import moment from 'moment';
//We need time and temperature
function Forecast({ data }) {
  const currentWeather = data.forecastday[0].hour;

  return (
    <StyledForecast>
      <h2>Hourly Forecast</h2>
      <div className='box-shadow current-forecast'>
        {currentWeather.map((weather) => (
          <div className='card box-shadow' key={weather.time_epoch}>
            <span>{moment(weather.time).format('h:mm:ss a')}</span>
            <img src={weather.condition.icon} alt='weather icon' />
            <p>{weather.temp_c} °C</p>
          </div>
        ))}
      </div>
      
     
    </StyledForecast>
  );
}

const StyledForecast = styled.div`
  margin-top: 40px;
  h2 {
    margin: 20px 0;
  }
  .current-forecast {
    padding: 20px;
    display: flex;
    overflow-y: hidden;

    .card {
      padding: 10px;
      margin-right: 20px;
      display: flex;
      flex-direction: column;
      align-items: center;
      background-color: #303134;
      color: #fff;

      :hover {
        background-color: #606060;
      }
      span {
        font-size: 0.9rem;
        text-align: center;
      }
    }

    /* width */
    ::-webkit-scrollbar {
      height: 5px;
      border-radius: 5px;
    }

    /* Track */
    ::-webkit-scrollbar-track {
      background: #f1f1f1;
      border-radius: 5px;
      width: 90%;
    }

    /* Handle */
    ::-webkit-scrollbar-thumb {
      background: #888;
      border-radius: 5px;
    }

    /* Handle on hover */
    ::-webkit-scrollbar-thumb:hover {
      background: #555;
      border-radius: 5px;
    }
  }

  .future-forecast {
    margin: 20px 0;
  }
`;

export default Forecast;
