let listOfAmstringNumbers=[0,1,153,370,371,407];
let a=listOfAmstringNumbers[Symbol.iterator]();
let getNextArmstrong=()=>{
    return a.next().value;
}
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong())