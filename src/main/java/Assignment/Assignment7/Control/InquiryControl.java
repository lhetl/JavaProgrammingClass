package Assignment.Assignment7.Control;

import Assignment.Assignment7.Boundary.Screen;
import Assignment.Assignment7.Entity.IAccount;

public class InquiryControl {
    public void execute(IAccount acc, Screen scr){
        scr.displayMessage("잔고가 "+acc.getBalance()+" 입니다.");
    }
}
