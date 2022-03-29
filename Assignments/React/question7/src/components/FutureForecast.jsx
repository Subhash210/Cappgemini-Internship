
<h2>Future Forecast</h2>
{data.forecastday.map((futureWeather) => (
  <div
    key={futureWeather.date_epoch}
    className='box-shadow current-forecast future-forecast'
  >
    {futureWeather.hour.map((weather) => (
      <div className='card box-shadow' key={weather.time_epoch}>
        <span>{moment(weather.time).format('h:mm:ss a')}</span>
        <img src={weather.condition.icon} alt='weather icon' />
        <p>{weather.temp_c} °C</p>
      </div>
    ))}
  </div>
))}