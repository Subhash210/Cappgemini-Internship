var myArray = [1,2,3,4,5,6,7,8,9]

function forLoopSum(Array){
    var sum = 0;
    for(var i = 0 ; i < Array.length ; i++){
        sum+=Array[i];
    }
    return sum;

}

function whileLoopSum(arr){

    var sum = 0;
    var i = 0
    while(i < arr.length){
        sum+=arr[i];
        i++;
    }
    return sum;
}

function doWhileLoopSum(arr){
    var i=0;
    var sum = 0;
    do{
        sum+=arr[i];
        i++
    }
    while(i < arr.length)
    return sum;
}

document.getElementById("result-for").innerHTML = "Sum using for loop : "+forLoopSum(myArray);
document.getElementById("result-while").innerHTML = "Sum using while loop : "+whileLoopSum(myArray);
document.getElementById("result-do-while").innerHTML = "Sum using while loop : "+doWhileLoopSum(myArray);
