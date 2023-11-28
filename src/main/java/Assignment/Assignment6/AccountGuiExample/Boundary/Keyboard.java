package Assignment.Assignment6.AccountGuiExample.Boundary;

import java.util.Scanner;

public class Keyboard {
    private Scanner keyBoard=new Scanner(System.in);
    public char getSelection(){
        return keyBoard.next().charAt(0);
    }
    public int getInt(){
        return keyBoard.nextInt();
    }
    public String getStr(){
        return keyBoard.next();
    }
    public void end(){
        keyBoard.close();
    }
}
