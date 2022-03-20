function evenOrOdd(N){
    if(N%2===0){
        return "even";
    }else{
        return "odd";
    }   
}

function result(){
    n = document.getElementById("num").value;
    document.getElementById("results").innerHTML = "Given Number is " + evenOrOdd(n);
}