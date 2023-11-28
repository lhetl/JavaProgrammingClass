package Assignment.Assignment6.AccountGuiExample.Control;

import Assignment.Assignment6.AccountGuiExample.Boundary.Keyboard;
import Assignment.Assignment6.AccountGuiExample.Boundary.Screen;
import Assignment.Assignment6.AccountGuiExample.Entity.IAccount;

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
