function square(n){
    return n*n;
}

var earray = [];
function arraySquare(arr , square){    
        if(arr.length == 0){
            return;
        } 
        earray.push(square(arr.slice(0,1)));
        arr = arr.slice(1,(arr.length));
        arraySquare(arr,square);
        return earray;
        
}
var arraySqrt = [] 
function arrSqrt(arr){
    
    if(arr.length == 0){
        return "Array is Empty"
    }
    arraySqrt.push(Math.sqrt(arr.slice(0,1)));
    arr = arr.slice(1,(arr.length));
    arrSqrt(arr);
    return arraySqrt;

}

var numberArray = [1,2,3,4,5];

document.getElementById("result-square").innerHTML = "Squares of each element in array : " + arraySquare(numberArray,square);
document.getElementById("result-sqrt").innerHTML = "Square Root of each element in array : " + arrSqrt(earray);

