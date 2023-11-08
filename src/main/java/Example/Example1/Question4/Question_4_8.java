package Example.Example1.Question4;

import java.util.Scanner;

public class Question_4_8 {
    public static final double pi=3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("도형 입력 (R: 사각형, T: 삼각형, C: 원) : ");
        char type=sc.next().charAt(0);
        double weight,height,radius,ansVal=0;
        String ans1="";
        switch(type){
            case 'R':
                System.out.print("가로 세로 입력: ");
                weight=sc.nextDouble();
                height=sc.nextDouble();
                ansVal=weight*height;
                ans1="사각형";
                break;
            case 'T':
                System.out.print("밑변 높이 입력: ");
                weight=sc.nextDouble();
                height=sc.nextDouble();
                ansVal=weight*height/2;
                ans1="삼각형";
                break;
            case 'C':
                System.out.print("반지름 입력");
                radius=sc.nextDouble();
                ansVal=radius*radius*pi;
                ans1="원";
                break;
        }
        System.out.println(ans1+"의 넓이"+ ansVal);
        sc.close();
    }
}
