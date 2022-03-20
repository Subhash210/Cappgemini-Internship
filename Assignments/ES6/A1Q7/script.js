//a
let myArray = ["Hello" , "World" , "name" , "something"];

let [ , , third , ] = myArray;

console.log(third);

//b

let organization  ={
    name : "Ram",
    address : {
        street : "Not mentioned",
        country : "India",
        pincode : 521361

    }
}

let {name: n , address : a} = organization;
console.log(a.pincode);