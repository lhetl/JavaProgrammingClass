package Assignment.Assignment3.Entity;

public class Account {
    private static int lastKey=0;
    private int key;
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.key =nextKey();
        this.owner = owner;
        this.balance = balance;
    }
    private static int nextKey(){
        return ++lastKey;
    }

    public int getBalance(){
        return this.balance;
    }
    public String getOwner(){
        return this.owner;
    }
    public void deposit(int amount){
        this.balance+=amount;
    }
    public boolean withdraw(int amount){
        if(amount<=this.balance){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }
}
