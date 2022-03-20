class rectangle {
    constructor(width , height ){
        this.height = height;
        this.width = width;
    }

}

rectangle.prototype.getArea = function(){
    return this.height*this.width;
};

const r1 = new rectangle(14,6);
document.write(r1.getArea());
