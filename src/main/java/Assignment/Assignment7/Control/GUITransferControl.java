package Assignment.Assignment7.Control;

import Assignment.Assignment7.Boundary.Keyboard;
import Assignment.Assignment7.Boundary.Screen;
import Assignment.Assignment7.Entity.IAccount;

public class GUITransferControl {
    public void execute(IAccount acc1, IAccount acc2, Screen scr, Keyboard kbd){
        scr.displayPrompt("출금할 금액을 입력하시오: ");
        int amount=kbd.getInt();
        if (acc1.withdraw(amount)) {
            acc2.deposit(amount);
            scr.displayMessage("계좌번호" + acc1.getAccountNumber() + "번 계좌의 잔고는 " + acc1.getBalance() + " 입니다."+
                                    "\n계좌번호" + acc2.getAccountNumber() + "번 계좌의 잔고는 " + acc2.getBalance() + " 입니다.");
        }else {
            scr.displayMessage("잔고가 부족합니다.");
        }
    }
}
