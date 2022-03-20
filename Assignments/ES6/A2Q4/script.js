let promise1 = new Promise(function(resolve,reject){
    let x=2;
    if(x!=0){
        resolve(x);
    }
    else{
        reject("x value is 0");
    }
})
let promise2 = new Promise(function(resolve,reject){
    let y=5;
    if(y!=0){
        resolve(y);
    }
    else{
        reject("y value is 0");
    }
})


 Promise.all([promise1,promise2]).then(function(values){
     let sum =0;
    for(let num in values){
        sum+=values[num];
    }
    console.log(sum)
 })