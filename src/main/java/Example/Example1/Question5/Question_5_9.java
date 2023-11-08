package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("층 입력: ");
        int stairs=sc.nextInt();
        for (int i=stairs;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
