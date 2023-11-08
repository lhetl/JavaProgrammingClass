package Example.Example4;

public class Account {
    private static long accountNumber=0L;
    private long balance;
    {
        accountNumber=nextAccountNumber();
    }
    public Account(){
//        accountNumber=nextAccountNumber();
    }
    public Account(long amount){
//        accountNumber=nextAccountNumber();
//        this();
        balance=amount;
    }
    private long nextAccountNumber(){
        return accountNumber++;
    }
}
