package Example.Example1.Question4;

import java.util.Scanner;

public class Question_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        Double a=sc.nextDouble();
        System.out.print("b: ");
        Double b=sc.nextDouble();
        String ans2= a>=b? a>b ? "bigger than" : "equal to" : "less than";
        System.out.println(a+" is "+ans2+" "+b);
    }
}
