package Example.Example8.Control;

import Example.Example8.Boundary.Screen;
import Example.Example8.Entity.Account;
import Example.Example8.Boundary.KeyBoard;

public class TransferControl {
    public void execute(Account srcAccount, Account destAccount, Screen screen, KeyBoard keyBoard){
        screen.displayPrompt("이체할 금액을 입력하시오: ");
        int amount = keyBoard.getInt();
        if (srcAccount.withdraw(amount)){
            screen.displayMessage("전송한 계좌의 잔고가"+srcAccount.getBalance()+"입니다");
            destAccount.deposit(amount);
            screen.displayMessage("전송받은 계좌의 잔고가"+destAccount.getBalance()+"입니다");
        }
        else{
            screen.displayMessage("잔고가 부족합니다.");
        }
    }
}
