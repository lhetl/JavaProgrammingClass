package Example.Example1.Question6;

import java.util.Scanner;

public class Question_6_3 {
    public static int divideNumber(int num1, int num2){
        int cnt=0;
        while(num1>=num2){
            num1-=num2;
            cnt+=1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a,b;
        System.out.print("number1: ");
        a=sc.nextInt();
        System.out.print("number2: ");
        b=sc.nextInt();

        System.out.println(a + " / "+b+" = "+divideNumber(a,b));
    }
}

