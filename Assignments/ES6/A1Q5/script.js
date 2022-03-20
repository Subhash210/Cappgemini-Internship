//a
let add = function(value = 10){
    return value;
}

console.log(add());

//b
let userFriendsRest = function(username , ...arrayFriends){
    console.log(username);
    for(let i in arrayFriends){
        console.log(arrayFriends[i]);
    }

}


//c
let printCapitalNames=(...capnames)=>{
    let arr=[];
    for(let i in capnames){
        arr.push(capnames[i].toUpperCase());
    }
    console.log(arr);
    return arr;
    
}
let a=printCapitalNames("ram","hey");
console.log(...a);