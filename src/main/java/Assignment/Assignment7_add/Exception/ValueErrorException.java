package Assignment.Assignment7_add.Exception;

import Assignment.Assignment7_add.Entity.GUI.ErrorGUI;
import com.sun.tools.javac.Main;

public class ValueErrorException extends MainErrorException {
    public ValueErrorException(){
        super("잘못된 형식을 입력했습니다");
    }
}
