package Assignment.Assignment3.A.Question9_7;

import java.util.Date;

class Account {
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated;

    public Account() {
        this.dateCreated=new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated=new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return (getMonthlyInterestRate()/100)*balance;
    }
    public void withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
        }else{
            balance=0;
        }
    }
    public void deposit(double amount){
        balance+=amount;
    }

}
