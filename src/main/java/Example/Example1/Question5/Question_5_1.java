package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number");
        int val = sc.nextInt();
        while (val>=1){
            System.out.print(val%10+" ");
            val/=10;
        }
    }
}
