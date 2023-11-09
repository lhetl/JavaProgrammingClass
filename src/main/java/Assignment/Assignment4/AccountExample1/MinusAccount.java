package Assignment.Assignment4.AccountExample1;

public class MinusAccount extends Account{
    private int limitAmount;

    public MinusAccount(int amount, int limitAmount) {
        super(amount);
        this.limitAmount = limitAmount;
    }

    public void deposit(int amount) {
        plusBalance(amount);
    }

    public void withdraw(int amount) {
        if((getBalance()+limitAmount)>=amount){
            minusBalance(amount);
        }
    }
}
