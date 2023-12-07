package Assignment.Assignment7_add.Exception;

import Assignment.Assignment7_add.Entity.GUI.ErrorGUI;

public class ValueErrorException extends RuntimeException{
    private ErrorGUI errorGUI=new ErrorGUI();
    public ValueErrorException(String message){

    }
}
