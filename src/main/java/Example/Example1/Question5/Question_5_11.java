package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Number1: ");
        num1=sc.nextInt();
        System.out.print("Number2: ");
        num2=sc.nextInt();
        int tmp;
        if(num1>num2){
            tmp=num1;
            num1=num2;
            num2=tmp;
        }
        int ans=0;
        System.out.print("Odd : ");
        for (int i=num1;i<=num2;i++){
            if (i%2==1){
                System.out.print(i+" ");
                ans+=i;
            }
        }
        System.out.println("\nsum: "+ans);
    }
}
