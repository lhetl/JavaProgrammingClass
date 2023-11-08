package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        for (int i=1;i<=val;i++){
            if (val%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
