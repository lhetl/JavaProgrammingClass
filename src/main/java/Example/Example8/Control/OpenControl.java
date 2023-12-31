package Example.Example8.Control;

import Example.Example8.Boundary.Screen;
import Example.Example8.Entity.Account;
import Example.Example8.Boundary.KeyBoard;


public class OpenControl {
    public Account execute(Screen screen, KeyBoard keyBoard){
        screen.displayPrompt("사용자의 이름을 입력해주세요: ");
        String name = keyBoard.getString();
        screen.displayPrompt("사용자의 계좌 금액을 입력해주세요: ");
        int balance = keyBoard.getInt();
        screen.displayMessage("계좌가 개설되었습니다. ");
        return new Account(name,balance);
    }
}
