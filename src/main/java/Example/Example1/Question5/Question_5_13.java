package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("층 입력: ");
        int stairs=sc.nextInt();
        for (int i=0;i<stairs;i++){
            for(int j=0;j<stairs-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0;i<stairs-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(stairs-i-1)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
