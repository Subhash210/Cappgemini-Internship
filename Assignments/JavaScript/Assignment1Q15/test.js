var rand=[];
var i=0;
while(i<20){
    var num= Math.floor(Math.random()*20)+1;
    rand[i]=num;
    i++;
}

document.write(rand);

function bubblesort(sort){
    var c=0;
    for(i=0;i<sort.length;i++){
        for(j=0;j<sort.length-i-1;j++){
            if(sort[j]>sort[j+1]){
                c = sort[j];
                sort[j]=sort[j+1];
                sort[j+1]=c;
            }
        }
    }
    return sort;
}
document.write("<br>bubblesort : "+bubblesort(rand));