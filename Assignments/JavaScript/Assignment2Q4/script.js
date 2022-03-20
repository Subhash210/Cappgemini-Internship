function square(n){
    return n*n;
}


function arraySquare(arr , square){
    var earray = [] 
    for( var i = 0 ; i < arr.length ; i++){

        earray.push(square(arr[i]));
    }
    return earray;
}

function arrSqrt(arr){
    var earray = [] 
    for( var i = 0 ; i < arr.length ; i++){

        earray.push(Math.sqrt(arr[i]))
    }
    return earray;

}

var numberArray = [1,5,3,5,6];

document.getElementById("result-square").innerHTML = "Squares of each element in array : " + arraySquare(numberArray,square);
document.getElementById("result-sqrt").innerHTML = "Square Root of each element in array : " + arrSqrt(arraySquare(numberArray,square));