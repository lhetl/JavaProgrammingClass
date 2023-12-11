package Assignment.Assignment7_add.Exception;

import Assignment.Assignment7_add.Entity.GUI.ErrorGUI;

public class MainErrorException extends RuntimeException{
    private static ErrorGUI errorGUI = new ErrorGUI();
    public MainErrorException(String message){
        errorGUI.setErrorMessage(message);
        errorGUI.display();
    }
}
