package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("binary: ");
        int val = sc.nextInt();
        int tmp,ans=0,cnt=0;
        while (val>=1){
            tmp=val%10;
            if (tmp==1){
                ans+=Math.pow(2,cnt);
            }
            val/=10;
            cnt++;
        }
        System.out.println("10진수: "+ans);
    }
}
