package Example.Example8.Control;

import Example.Example8.Boundary.Screen;
import Example.Example8.Entity.Account;

public class InquiryControl {
    public void execute(Account account, Screen screen){
        screen.displayMessage("잔고가"+account.getBalance()+"입니다");
    }
}
