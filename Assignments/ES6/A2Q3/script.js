function isArmstrong(num){
    let d=0;
    let n1=num;
    
    
    while(n1>0){
        d++;
        n1=Math.floor(n1/10);
    }
    let n=num;
    let arm=0;
    
    while(n>0){
        rem = n%10;
        console.log(rem);
        arm = arm+Math.pow(rem,d);
      
        n = Math.floor(n/10);
    }
  
    if(arm==num){
        return true;
    }
    else{
        return false;
    }
}

function *getNextArmstrong(){
    let i=0;
    while(true){
        if( isArmstrong(i)){
            yield i;
        }
        if(i>1000){
            i=0;
            yield "number is too larger";
        }
        i++;
    }
}

 var g = getNextArmstrong();
console.log(g.next());
// console.log(g.next().value)
// console.log(g.next().value)
console.log(g.next());
console.log(g.next());
console.log(g.next());
