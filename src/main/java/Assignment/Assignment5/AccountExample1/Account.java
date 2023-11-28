package Assignment.Assignment5.AccountExample1;

public abstract class Account implements IAccount {
    private static int lastNumber = 0;
    private int AccountNumber;
    private int balance;
    public Account(int amount){
        AccountNumber=nextAccNum();
        balance=amount;
    }
    public int getAccNum() {
        return AccountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
    protected void minusBalance(int amount){
        balance-=amount;
    }
    protected void plusBalance(int amount){
        balance+=amount;
    }
    protected static int nextAccNum(){
        return ++lastNumber;
    }
    public void showAccount(){
        System.out.printf("%04d-%04d %10d%n",AccountNumber/1000,AccountNumber%10000,balance);
    }

}