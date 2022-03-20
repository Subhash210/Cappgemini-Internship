function createTable()
{
var r = document.getElementById("row").value; 
var c = document.getElementById("column").value;
    
    for(var i = 0; i<r ; i++ ){
        
        var x = document.getElementById("myTable").insertRow(i);

        for(var j = 0; j<c ; j++){

            var y = x.insertCell(j);
            y.innerHTML = "Row" + (i+1) + "Column" + (j+1);
        }
    }

    
}