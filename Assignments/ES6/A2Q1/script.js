class Fibonacci_series{
    constructor(previousNo=0,currentNo=1){
        this.currentNo=currentNo;
        this.previousNo=previousNo;
    }
    
    previousNo=Symbol("firstNumber");
    currentNo=Symbol("secondNumber");

    next(){
        let next=this.previousNo+this.currentNo;
        this.previousNo=this.currentNo;
        this.currentNo=next;
        return next;
    }
}
let series= new Fibonacci_series();
console.log(series.next());