package Example.Example1.Question4;

import java.util.Scanner;

public class Question_4_2 {
    public static void main(String[] args) {
        System.out.print("num:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num+" is "+(num%2==0? "Even" : "Odd")+" number");
    }
}
