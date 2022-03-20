function square(a){
    return a*a;
}

function double(a){
    return a*2;
}

function composedValue(x,y,z){
    return x(y(z));
}


document.getElementById("result").innerHTML = "Result is :" + composedValue(square,double,5);