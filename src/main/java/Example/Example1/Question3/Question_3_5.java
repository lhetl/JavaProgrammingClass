package Example.Example1.Question3;

import java.util.Scanner;

public class Question_3_5 {
    public static void main(String[] args) {
        System.out.print("second:");
        Scanner sc =new Scanner(System.in);
        int sec=sc.nextInt();
        int hour=sec/3600;
        sec%=3600;
        int minute=sec/60;
        sec%=60;
        System.out.println(hour+"h  "+minute+"m  "+sec+"s");

    }
}
