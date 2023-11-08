package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Number1: ");
        num1=sc.nextInt();
        System.out.print("Number2: ");
        num2=sc.nextInt();
        int cnt=num1;
        while(num1>num2){
            num1-=num2;
        }
        System.out.print(cnt+" % "+num2+" = "+num1);
    }
}
