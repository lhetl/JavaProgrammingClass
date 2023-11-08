package Example.Example1.Question3;

import java.util.Scanner;

public class Question_3_2 {
    public static void main(String[] args){
        System.out.println("ax^2+bx+c=y");
        System.out.print("input:");
        double a,b,c,x;
        Scanner sc  = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        x=sc.nextDouble();
        System.out.println("계산값: "+(a*Math.pow(x,2)+b*x+c));

    }
}
