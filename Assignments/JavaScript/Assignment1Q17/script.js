var myArray = [1,2,3,4,5,6];

function lstRotate(lst,n){
    
    for(var i = 0 ; i<n ; i++){
        for(var j = 0 ; j<lst.length-1 ; j++){
            var temp = lst[j];
            lst[j] = lst[j+1];
            lst[j+1]=temp;       
        }
    }
    return lst;
}


document.write(lstRotate(myArray,2));