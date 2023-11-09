package Assignment.Assignment1;

public class TestOfAccount {
    public static void main(String[] args) {
        Account hong;
        hong = new Account("홍길동", 1000);
        hong.showAccount();
        hong.deposit(10000); System.out.print("입금 10000: "); hong.showAccount();
        hong.withdraw(5000); System.out.print("출금  5000: "); hong.showAccount();
        hong.deposit(20000); System.out.print("입금 20000: "); hong.showAccount();
        System.out.println();

        Account kim = new Account("김부자", 2000);
        kim.showAccount();
        kim.deposit(20000); System.out.print("입금 20000: "); kim.showAccount();
        kim.withdraw(7000); System.out.print("출금  7000: "); kim.showAccount();
        kim.deposit(40000); System.out.print("입금 40000: "); kim.showAccount();
        System.out.println();
    }
}
