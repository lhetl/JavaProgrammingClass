package Example.Example8.Boundary;

import java.util.Scanner;

public class KeyBoard {
    private Scanner sc = new Scanner(System.in);
    public char getSelection(){
        return sc.next().charAt(0);
    }
    public Integer getInt(){
        return sc.nextInt();
    }
    public String getString(){
        return sc.next();
    }
}
