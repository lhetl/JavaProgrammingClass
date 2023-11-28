package Assignment.Assignment6.AccountGuiExample.Entity;

public class MinusAccount extends Account {
    private int creditAmount;

    public MinusAccount(int number, int amount, int creditAmount) {
        super(number, amount);
        this.creditAmount = creditAmount;
    }
    public boolean withdraw(int amount){
        if (amount<=balance+creditAmount){
            balance-=amount;
            return true;
        }else{
            return false;
        }
    }
}
