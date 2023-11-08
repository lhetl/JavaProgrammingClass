package Example.Example8.Control;

import Example.Example8.Boundary.Screen;
import Example.Example8.Entity.Account;
import Example.Example8.Boundary.KeyBoard;

public class DepositControl {
    public void execute(Account account, Screen screen, KeyBoard keyBoard){
        screen.displayPrompt("입금할 금액을 입력하시오: ");
        int amount = keyBoard.getInt();
        account.deposit(amount);
        screen.displayMessage("잔고가"+account.getBalance()+"입니다");
    }
}
