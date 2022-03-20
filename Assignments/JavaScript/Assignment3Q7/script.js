var p1 = {
    fname : "Ram",
    lname : "Gajini"
}




console.log(p1.fname);
console.log(p1.lname);
console.log(p1.middleName);

p1.middleName = "Hamsa";

console.log(p1.middleName);

var p = '{"fname" : "Ram" , "lname" : "Gajini"}';

let r = JSON.parse(p)

console.log(typeof r);

console.log(r);

