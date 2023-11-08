package Assignment.OrientAssignment3.A.Question9_7;

public class Test {
    public static void main(String[] args) {
        Account acc1=new Account(1122,20000);
        acc1.setAnnualInterestRate(4.5);
        acc1.withdraw(2500);acc1.deposit(3000);
        System.out.println("Balance: "+acc1.getBalance()+" MonthlyInterest: "+acc1.getMonthlyInterest()+" CreatedAt: "+acc1.getDateCreated());
    }
}
