package Assignment.Assignment6.AccountGuiExample.Control;

import Assignment.Assignment6.AccountGuiExample.Boundary.Screen;
import Assignment.Assignment6.AccountGuiExample.Entity.IAccount;

public class InquiryControl {
    public void execute(IAccount acc, Screen scr){
        scr.displayMessage("잔고가 "+acc.getBalance()+" 입니다.");
    }
}
