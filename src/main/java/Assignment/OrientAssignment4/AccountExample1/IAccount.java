package Assignment.OrientAssignment4.AccountExample1;

public interface IAccount {
    public int getAccNum();
    public int getBalance();
    public void deposit(int amount);
    public void withdraw(int amount);
    public void showAccount();
}
