package Assignment.Assignment7.Control;

import Assignment.Assignment7.Boundary.Keyboard;
import Assignment.Assignment7.Boundary.Screen;
import Assignment.Assignment7.Entity.IAccount;

public class WithdrawControl {
    public void execute(IAccount acc, Screen scr, Keyboard kbd){
        scr.displayPrompt("출금할 금액을 입력하시오: ");
        int amount=kbd.getInt();
        if (acc.withdraw(amount))
            scr.displayMessage("잔고가 " + acc.getBalance() + " 입니다.");
        else
            scr.displayMessage("잔고가 부족합니다.");
    }
}
