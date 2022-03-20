var Order = {
    id : 1,
    title : "Ram",
    price : 45,
    printOrder: function() {
        return this.id + " " + this.title+" "+this.price;
      },

    getPrice : function(){
        return this.price;
    }

};

var copy = Object.assign(Order);

console.log(copy.printOrder());
console.log(copy.getPrice());
