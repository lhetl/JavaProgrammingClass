package Assignment.OrientAssignment2.Control;

import Assignment.OrientAssignment2.Boundary.KeyBoard;
import Assignment.OrientAssignment2.Boundary.Screen;
import Assignment.OrientAssignment2.Entity.Account;

public class DepositControl {
    public void execute(Account account, Screen screen, KeyBoard keyBoard){
        screen.displayPrompt("입금할 금액을 입력하시오: ");
        int amount = keyBoard.getInt();
        account.deposit(amount);
        screen.displayMessage("잔고가"+account.getBalance()+"입니다");
    }
}
