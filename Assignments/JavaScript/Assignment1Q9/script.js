var a = [5,10,15];
var b = ['A', 'B', 'C'];

var newList = function(a,b)
{
  var l = a.length+b.length;
  var r = [];
  var j=0,k=0;
  for(let i=0; i<l;i++) {
    if(i%2==0) {
      r[i]=a[j++];
    } else {
      r[i]=b[k++];
    }
  }
  return r;
}

document.write(newList(a,b));