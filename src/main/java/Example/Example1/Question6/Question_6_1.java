package Example.Example1.Question6;

import java.util.Scanner;

public class Question_6_1 {
    public static int sumNumber(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a,b;
        System.out.print("number1: ");
        a=sc.nextInt();
        System.out.print("number2: ");
        b=sc.nextInt();

        System.out.println(a + " + "+b+" = "+sumNumber(a,b));
    }
}
