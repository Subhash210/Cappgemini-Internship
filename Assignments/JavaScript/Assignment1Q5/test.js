function leapYear(year) {
  var myArray = [];
  var a = 0;
  while(a<20){
    year++;
    if(year%400==0 || (year%4==0 && year%100!=0)){
      myArray.push(year);

      a++;
    }
  }
  return myArray;
  }
  
function result(){
  var y = document.getElementById("year").value;

  document.getElementById("results").innerHTML = "Next 20 Leap Years from "+ y +" are :(" + leapYear(y) + ")";

 
}
