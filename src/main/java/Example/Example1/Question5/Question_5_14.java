package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Number1: ");
        num1=sc.nextInt();
        System.out.print("Number2: ");
        num2=sc.nextInt();
        int tmp;
        if(num1>num2){
            tmp=num1;
            num1=num2;
            num2=tmp;
        }
        boolean check;
        for (int i=num1;i<=num2;i++){
            check=false;
            if (i%3==0){
                check=true;
            }
            if (i%5==0){
                check=true;
            }

            if (check==true){
                System.out.print(i+" ");
            }
        }
    }
}
