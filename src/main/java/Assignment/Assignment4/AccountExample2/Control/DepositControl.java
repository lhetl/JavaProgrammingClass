package Assignment.Assignment4.AccountExample2.Control;

import Assignment.Assignment4.AccountExample2.Entity.IAccount;
import Assignment.Assignment4.AccountExample2.Boundary.Keyboard;
import Assignment.Assignment4.AccountExample2.Boundary.Screen;

public class DepositControl {
    public void execute(IAccount acc, Screen scr, Keyboard kbd){
        scr.displayPrompt("입금할 금액을 입력하시오: ");
        int amount=kbd.getInt();
        acc.deposit(amount);
        scr.displayMessage("잔고가"+acc.getBalance()+" 입니다");
    }
}
