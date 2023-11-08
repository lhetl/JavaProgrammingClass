package Example.Example1.Question4;

import java.util.Scanner;

public class Question_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        int num1=sc.nextInt();
        char set=sc.next().charAt(0);
        int num2=sc.nextInt();
        double ans=0;
        switch(set){
            case '+':
                ans=num1+num2;
                break;
            case '-':
                ans=num1-num2;
                break;
            case '*':
                ans=num1*num2;
                break;
            case '/':
                if(num2==0){
                    ans=0;
                }else{
                    ans=num1/num2;
                }
                break;
        }
        System.out.println(num1+" "+set+" "+num2+" = "+ans);
    }
}
