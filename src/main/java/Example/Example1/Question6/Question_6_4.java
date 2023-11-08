package Example.Example1.Question6;

import java.util.Scanner;

public class Question_6_4 {
    public static double distance(int x1,int y1,int x2,int y2){
        double dx = Math.abs(x2 - x1);
        double dy = Math.abs(y2 - y1);
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;
        System.out.print("firstPoint: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("secondPoint; ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println(distance(x1, y1, x2, y2));

    }
}
