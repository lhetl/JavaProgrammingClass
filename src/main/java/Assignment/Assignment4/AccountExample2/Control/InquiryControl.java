package Assignment.Assignment4.AccountExample2.Control;

import Assignment.Assignment4.AccountExample2.Entity.IAccount;
import Assignment.Assignment4.AccountExample2.Boundary.Screen;

public class InquiryControl {
    public void execute(IAccount acc, Screen scr){
        scr.displayMessage("잔고가"+acc.getBalance()+"입니다.");
    }
}
