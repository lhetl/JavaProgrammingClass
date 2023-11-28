package Assignment.Assignment6.AccountGuiExample.Control;

import Assignment.Assignment6.AccountGuiExample.Boundary.Keyboard;
import Assignment.Assignment6.AccountGuiExample.Boundary.Screen;
import Assignment.Assignment6.AccountGuiExample.Entity.IAccount;

public class DepositControl {
    public void execute(IAccount acc, Screen scr, Keyboard kbd){
        scr.displayPrompt("입금할 금액을 입력하시오: ");
        int amount=kbd.getInt();
        acc.deposit(amount);
        scr.displayMessage("잔고가"+acc.getBalance()+" 입니다");
    }
}
