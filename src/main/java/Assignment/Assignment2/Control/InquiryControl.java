package Assignment.Assignment2.Control;

import Assignment.Assignment2.Boundary.Screen;
import Assignment.Assignment2.Entity.Account;

public class InquiryControl {
    public void execute(Account account, Screen screen){
        screen.displayMessage("잔고가"+account.getBalance()+"입니다");
    }
}
