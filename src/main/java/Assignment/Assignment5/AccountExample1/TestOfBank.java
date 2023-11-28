package Assignment.Assignment5.AccountExample1;

public class TestOfBank {
    public static void main(String[] args) {
        // IAccount: 참조변수의 선언타입 – 호출가능한 메소드를 결정함
        IAccount hong, kim;

        // NormalAccount: 참조변수의 실제타입 – 실제 호출될 클래스를 결정함
        hong = new NormalAccount(1000); hong.showAccount();

        hong.deposit(10000); System.out.print("입금 10000: "); hong.showAccount();
        hong.withdraw(5000); System.out.print("출금  5000: "); hong.showAccount();
        hong.withdraw(9000); System.out.print("출금  9000: "); hong.showAccount();
        System.out.println();
        kim = new MinusAccount(2000, 50000); kim.showAccount();
	    kim.deposit(20000); System.out.print("입금 20000: "); kim.showAccount();
    	kim.withdraw(7000); System.out.print("출금  7000: "); kim.showAccount();
	    kim.withdraw(50000);System.out.print("출금 50000: "); kim.showAccount();
    } // end of main
} // end of Bank

