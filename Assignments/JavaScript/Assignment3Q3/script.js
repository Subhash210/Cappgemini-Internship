class rectangle {
    constructor(width , height){
        this.height = height;
        this.width = width;
    }

}

rectangle.prototype.getArea = function(){
    return this.height*this.width;
};

const r = new rectangle(4, 5);
//r.hieght = 50;  {height not hieght JavaScript is Case Sensitive}
r.height = 50;
document.write(r.getArea()); 
