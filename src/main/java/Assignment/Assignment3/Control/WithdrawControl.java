package Assignment.Assignment3.Control;

import Assignment.Assignment3.Boundary.KeyBoard;
import Assignment.Assignment3.Boundary.Screen;
import Assignment.Assignment3.Entity.Account;

public class WithdrawControl {
    public void execute(Account account, Screen screen, KeyBoard keyBoard){
        screen.displayPrompt("출금할 금액을 입력하시오: ");
        int amount = keyBoard.getInt();
        if (account.withdraw(amount)){
            screen.displayMessage("잔고가"+account.getBalance()+"입니다");
        }
        else{
            screen.displayMessage("잔고가 부족합니다.");
        }
    }
}
