var a= ["Hello", "World", "in", "a", "frame"] ;
function rectangle(str){
    var b=str.length;
    var c="*";
    document.write("<br>"+c.repeat(b+4));
    for(i=0;i<b;i++){
    document.write("<br>*"+str[i]+"*");
    }
    document.write("<br>"+c.repeat(b+4));
}
rectangle(a);