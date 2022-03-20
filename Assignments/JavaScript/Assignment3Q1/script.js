class rectangle {
    constructor(width , height){
        this.height = height;
        this.width = width;
    }
}

const r1 = new rectangle(14,6);
document.write("rectangle1 :<br>"+"width: "+ r1.width + " height: " + r1.height);
const r2 = new rectangle(6,11);
document.write("<br>rectangle2 :<br>"+"width: "+ r2.width + " height: " + r2.height);
const r3 = new rectangle(1,12);
document.write("<br>rectangle3 :<br>"+"width: "+ r3.width + " height: " + r3.height);
const r4 = new rectangle(3,16);
document.write("<br>rectangle4 :<br>"+"width: "+ r4.width + " height: " + r4.height);

r1.height = 50;
r2.width = 12;

document.write("rectangle1 after overriding :<br>"+"width: "+ r1.width + " height: " + r1.height);
document.write("<br>rectangle2  after overriding:<br>"+"width: "+ r2.width + " height: " + r2.height);
