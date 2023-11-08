package Assignment.OrientAssignment4.AccountExample2.Entity;

class Account implements IAccount {
    protected int accountNumber;
    protected int balance;

    public Account(int number, int amount) {
        this.accountNumber=number;
        this.balance=amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public boolean withdraw(int amount){
        if (amount<=balance){
            balance-=amount;
            return true;
        }else{
            return false;
        }
    }
}
