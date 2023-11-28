package Assignment.Assignment3.Boundary;

import java.util.Scanner;

public class KeyBoard {
    private Scanner kbd = new Scanner(System.in);
    public char getSelection(){
        return kbd.next().charAt(0);
    }
    public int getInt(){
        return kbd.nextInt();
    }
    public String getString(){
        return kbd.next();
    }
}
