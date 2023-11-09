package Assignment.Assignment1;

class Account {
    private long lastAccountNumber=0L;
    private long accountNumber;
    private long balance;
    private String owner;

    Account(String owner, long amount) {
        this.accountNumber = nextAccountNumber();
        this.owner = owner;
        this.balance = amount;
    }

    private long nextAccountNumber() {
        return ++lastAccountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public long withdraw(long amount) {
        return this.balance>=amount ? this.balance-=amount : 0L;
    }

    public void showAccount()	{
        System.out.printf("%10d%10s%10d%n", this.accountNumber, owner,balance);
    }
}

