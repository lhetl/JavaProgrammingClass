package Example.Example1.Question3;

import java.util.Scanner;

public class Question_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=Integer.MIN_VALUE;
        while(a<0 || a>25){
            System.out.print("정수: ");
            a=sc.nextInt();
            if (a<0 || a>25){
                System.out.println("값이 잘못 입력됨");
            }
        }
        System.out.println("알파벳 출력:"+(char)('a'+a));
    }
}
