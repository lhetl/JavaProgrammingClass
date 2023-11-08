package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=1;
        int max=sc.nextInt();
        System.out.print(max+"! = ");
        for (int i=max;i>1;i--){
            ans*=i;
            System.out.print(i+" * ");
        }
        System.out.print("1 = "+ans);
    }
}
