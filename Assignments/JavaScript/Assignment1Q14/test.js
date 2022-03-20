var numbers = [];

function randomNumbers(arr){
    for(var i = 0 ;  i<=1000 ; i++){
        var n = Math.floor(Math.random() * 101);
        arr.push(n);
    }
    return arr;
}

function largest(arr){
   return Math.max.apply(null,arr);
}

function smallest(arr){
    return Math.min.apply(null,arr);
}


function Sum(arr){
    var sum=0;
    for(var i = 0 ; i < arr.length ; i++){
        sum+=arr[i];
    }
    return sum;
}

function average(arr){
    var total = Sum(arr);
    var n = arr.length;
    var average = total/n;
    return average;
}

function evenOrOdd(arr){
    var oddCount = 0;
    var evenCount = 0
    for(var i = 0 ; i < arr.length ; i++){
        if(arr[i]%2===0){
            evenCount++;
        }else{
            oddCount++;
        }  
    }
    var str = "Even Count: " + evenCount + "<br>Odd Count: " + oddCount;
    return str;

}
document.getElementById("result-max").innerHTML = "Maximum Number : "+largest(randomNumbers(numbers));
document.getElementById("result-min").innerHTML = "Minimum Number : "+smallest(randomNumbers(numbers));
document.getElementById("result-oddAndEvenCount").innerHTML = evenOrOdd(randomNumbers(numbers));
document.getElementById("result-average").innerHTML = "Average of the numbers : "+average(randomNumbers(numbers));
document.getElementById("result-sum").innerHTML = "Sum of the numbers : "+Sum(randomNumbers(numbers));
