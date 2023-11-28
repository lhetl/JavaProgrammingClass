package Assignment.Assignment3.Control;

import Assignment.Assignment3.Boundary.Screen;
import Assignment.Assignment3.Entity.Account;

public class InquiryControl {
    public void execute(Account account, Screen screen){
        screen.displayMessage("잔고가"+account.getBalance()+"입니다");
    }
}
