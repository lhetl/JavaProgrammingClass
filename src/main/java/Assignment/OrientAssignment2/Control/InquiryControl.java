package Assignment.OrientAssignment2.Control;

import Assignment.OrientAssignment2.Boundary.Screen;
import Assignment.OrientAssignment2.Entity.Account;

public class InquiryControl {
    public void execute(Account account, Screen screen){
        screen.displayMessage("잔고가"+account.getBalance()+"입니다");
    }
}
