document.write("Fibonacci numbers up to 100 : <br><br>");
var a=1;
var b=1;
for(i=1;i<=100;i++){
    var sum=a+b;
    a=b;
    b=sum;
    document.write(a+" ,")
    if(sum>100){
        break;
    }    
}