package Assignment.Assignment7_add.Exception;

import Assignment.Assignment7_add.Entity.GUI.ErrorGUI;

public class MainErrorException extends RuntimeException{
    private ErrorGUI errorGUI = new ErrorGUI();
    public MainErrorException(String message){

    }
}
