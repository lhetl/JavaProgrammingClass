package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size 입력: ");
        int stairs=sc.nextInt();
        for (int i=stairs;i>0;i--){
            for (int j=stairs;j>0;j--){
                if((i==1 || i==stairs) || (j==1 || j==stairs)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
