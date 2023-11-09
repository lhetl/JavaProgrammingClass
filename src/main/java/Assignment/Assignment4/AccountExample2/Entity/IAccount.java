package Assignment.Assignment4.AccountExample2.Entity;
public interface IAccount {
    int getAccountNumber();
    int getBalance();
    void deposit(int amount);
    boolean withdraw(int amount);
}
