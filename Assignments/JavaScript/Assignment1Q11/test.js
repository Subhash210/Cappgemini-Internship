var myArray = ["Captain America",54,"Black Widow",63,true,5.23,"tom and jerry",'A',"C"];
function reverseArray(a){
    a.reverse();
    return a;
}

document.getElementById("arr").innerHTML = reverseArray(myArray);
