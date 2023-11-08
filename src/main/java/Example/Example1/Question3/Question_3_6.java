package Example.Example1.Question3;

import java.util.Scanner;

public class Question_3_6 {
    public static final double pi = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름:");
        int rad=sc.nextInt();
        System.out.println("면적: "+(rad*rad*pi)+"둘레: "+(rad*2*pi));


    }

}
