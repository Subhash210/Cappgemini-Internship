var str = "The quick brown fox";

function Strlatin(word){
    var s1 = "";
    var myArray = word.split(" ");
    for (var i = 0; i < myArray.length; i++) {
        var w = myArray[i];       
        var f = w[0];
        w = w.substring(1);
        s1 = s1 + w + f.toLowerCase() +"ay ";
 
    }
    return s1.charAt(0).toUpperCase() + s1.slice(1);
}
document.getElementById("result").innerHTML = "Pig Latin for: The quick brown fox is<br><br> "  + Strlatin(str)
