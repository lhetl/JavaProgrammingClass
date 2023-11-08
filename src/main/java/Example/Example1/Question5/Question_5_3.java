package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Number1: ");
        num1=sc.nextInt();
        System.out.print("Number2: ");
        num2=sc.nextInt();
        int cnt=0;
        for (int i=0;i<num2;i++){
            cnt+=num1;
        }
        System.out.print(num1+" * "+num2+" = "+cnt);
    }
}
