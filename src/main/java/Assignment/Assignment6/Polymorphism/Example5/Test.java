package Assignment.Assignment6.Polymorphism.Example5;

import java.util.Scanner;

public class Test {
    static int mX(String value) {
        int x;
        try {
            x=Integer.parseInt(value)*2;
        } catch (Exception e) {
            x=Integer.MAX_VALUE;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mX(sc.next()));
    }
}
