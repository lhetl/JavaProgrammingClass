package Assignment.Assignment6.AccountGuiExample.Entity;
public interface IAccount {
    int getAccountNumber();
    int getBalance();
    void deposit(int amount);
    boolean withdraw(int amount);
}
