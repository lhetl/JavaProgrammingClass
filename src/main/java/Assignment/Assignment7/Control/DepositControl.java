package Assignment.Assignment7.Control;

import Assignment.Assignment7.Boundary.Keyboard;
import Assignment.Assignment7.Boundary.Screen;
import Assignment.Assignment7.Entity.IAccount;

public class DepositControl {
    public void execute(IAccount acc, Screen scr, Keyboard kbd){
        scr.displayPrompt("입금할 금액을 입력하시오: ");
        int amount=kbd.getInt();
        acc.deposit(amount);
        scr.displayMessage("잔고가"+acc.getBalance()+" 입니다");
    }
}
