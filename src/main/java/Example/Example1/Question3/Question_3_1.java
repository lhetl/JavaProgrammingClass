package Example.Example1.Question3;

import java.util.Scanner;

public class Question_3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1: ");
        int a=sc.nextInt();
        System.out.println("2: ");
        int b=sc.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(float)a/b);
        System.out.println(a+"%"+b+"="+(a%b));
    }
}
