package Assignment.OrientAssignment4.AccountExample2.Control;

import Assignment.OrientAssignment4.AccountExample2.Entity.IAccount;
import Example.Example11.Boundary.*;
import Assignment.OrientAssignment4.AccountExample2.Boundary.Keyboard;
import Assignment.OrientAssignment4.AccountExample2.Boundary.Screen;

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
