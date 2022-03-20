function numberSum(n) {
    var sum = 0;
      for(var i = 1; i <= n; i++){
        sum += i;
      }
      return sum;
  }
  
function result(){
  val = document.getElementById("val").value;
  document.getElementById("results").innerHTML="Sum of the numbers from 1 to "+val+" is : "+numberSum(val);
}
