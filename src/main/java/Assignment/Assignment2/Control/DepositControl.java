package Assignment.Assignment2.Control;

import Assignment.Assignment2.Boundary.KeyBoard;
import Assignment.Assignment2.Boundary.Screen;
import Assignment.Assignment2.Entity.Account;

public class DepositControl {
    public void execute(Account account, Screen screen, KeyBoard keyBoard){
        screen.displayPrompt("입금할 금액을 입력하시오: ");
        int amount = keyBoard.getInt();
        account.deposit(amount);
        screen.displayMessage("잔고가"+account.getBalance()+"입니다");
    }
}
