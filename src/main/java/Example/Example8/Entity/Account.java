package Example.Example8.Entity;

public class Account {
    private static Integer lastPk=0;
    private Integer pk;
    private String owner;
    private Integer balance;

    public Account(String owner, Integer balance) {
        this.pk =nextPk();
        this.owner = owner;
        this.balance = balance;
    }
    private static Integer nextPk(){
        return ++lastPk;
    }

    public Integer getBalance(){
        return this.balance;
    }
    public String getOwner(){
        return this.owner;
    }
    public void deposit(Integer amount){
        this.balance+=amount;
    }
    public boolean withdraw(Integer amount){
        if(amount<=this.balance){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }
}
