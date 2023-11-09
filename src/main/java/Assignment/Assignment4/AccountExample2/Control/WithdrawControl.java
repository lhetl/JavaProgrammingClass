package Assignment.Assignment4.AccountExample2.Control;

import Assignment.Assignment4.AccountExample2.Entity.IAccount;
import Assignment.Assignment4.AccountExample2.Boundary.Keyboard;
import Assignment.Assignment4.AccountExample2.Boundary.Screen;

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
