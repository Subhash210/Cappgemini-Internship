class Account{
    constructor(id , Name , balance){
        this.id = id,
        this.Name = Name,
        this.balance = balance
    }
}

class SavingAccount extends Account{
    
    constructor(id , Name , balance ,interest , cash_credit){
        super(id , Name , balance);
        this.interest = interest,
        this.cash_credit = cash_credit
    }

    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance + (this.balance*this.interest);
        return this.totalBalance;
    }
}

class CurrentAccount extends Account{
    
    constructor(id , Name , balance , cash_credit){
        super(id , Name , balance);
        this.cash_credit = cash_credit
    }

    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance -this.cash_credit;
        return this.totalBalance;
    }
}


accountobj=new Account(11,"Man",25000);

SavingAccountObj = new SavingAccount(11,"Man",25000,10);
console.log(SavingAccountObj.getBalance());

CurrentAccountObj = new CurrentAccount(11,"Man",25000,200);
console.log(CurrentAccountObj.getBalance());
