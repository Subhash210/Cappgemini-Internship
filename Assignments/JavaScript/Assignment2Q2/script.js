function square(a){
    return a*a;
}

function double(a){
    return a*2;
}

function composedValue(z){
    return square(double(z));
}


document.getElementById("result").innerHTML = "Result is :" + composedValue(5);