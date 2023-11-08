package Example.Example6;

public class Account {
    private static long lastAccountNumber=0;
    private long accountNumber;
    private Owner owner;
    private long balance;
    public Account(Owner owner){
        this.accountNumber=nextAccountNumber();
        this.balance=0;
        this.owner=owner;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public Account(Owner owner, long amount){
        this.accountNumber=nextAccountNumber();
        this.balance=amount;
        this.owner=owner;
    }
    private long nextAccountNumber(){
        return ++lastAccountNumber;
    }
    public void withdraw(long amount){
        if(this.balance-amount>0) {
            this.balance -= amount;
        }else{
            this.balance=0;
        }
    }
    public void deposit(long amount){
        this.balance+=amount;
    }
    public String showAccount() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public String showOwner() {
        return owner.showOwner();
    }
}
