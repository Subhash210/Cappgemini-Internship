function isEven(num) { 
    return(num%2 == 0);
}

function find(arr , test){
        var h = arr.shift();
        if(test(arr[h])){
            return arr[h];
        }
        else{
            
            return find(arr , test)
        }
    
}

var m = [1,5,4,5,6];


document.getElementById("result").innerHTML = "First Occuring Even digit is : " + find(m,isEven)
