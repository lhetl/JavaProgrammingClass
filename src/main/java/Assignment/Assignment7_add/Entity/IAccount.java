package Assignment.Assignment7_add.Entity;
public interface IAccount {
    int getAccountNumber();
    int getBalance();
    void deposit(int amount);
    boolean withdraw(int amount);
}
