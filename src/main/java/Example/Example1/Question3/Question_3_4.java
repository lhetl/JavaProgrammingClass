package Example.Example1.Question3;

import java.util.Scanner;

public class Question_3_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("weight: ");
        double w=sc.nextDouble();
        System.out.print("height: ");
        double h=sc.nextDouble();
        System.out.print("몸무게:"+w+"kg"+"키:"+h+"cm"+"------> 비만도:");
        System.out.printf("%.3f",(h-110)/w);
    }
}
