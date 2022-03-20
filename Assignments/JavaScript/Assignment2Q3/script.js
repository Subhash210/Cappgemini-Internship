function isEven(num) { 
    return(num%2 == 0);
}

function find(arr , test){
    for( var i = 0 ; i < arr.length ; i++){
        if(test(arr[i])){
            return arr[i];
        }
        else{
            continue;
        }
    }
}

var m = [1,5,3,5,6];

document.getElementById("result").innerHTML = "First Occuring Even digit is : " + find(m,isEven)
