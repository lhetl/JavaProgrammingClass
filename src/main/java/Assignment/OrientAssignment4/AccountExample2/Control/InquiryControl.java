package Assignment.OrientAssignment4.AccountExample2.Control;

import Assignment.OrientAssignment4.AccountExample2.Entity.IAccount;
import Assignment.OrientAssignment4.AccountExample2.Boundary.Screen;

public class InquiryControl {
    public void execute(IAccount acc, Screen scr){
        scr.displayMessage("잔고가"+acc.getBalance()+"입니다.");
    }
}
