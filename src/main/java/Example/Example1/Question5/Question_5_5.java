package Example.Example1.Question5;

import java.util.Scanner;

public class Question_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueAns;
        double num1,num2;
        char set;
        double ans=0;
        do {
            System.out.print("input: ");
            num1 = sc.nextDouble();
            set = sc.next().charAt(0);
            num2 = sc.nextDouble();
            switch (set) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        ans = 0;
                    } else {
                        ans = num1 / num2;
                    }
                    break;
            }
            System.out.println(num1 + " " + set + " " + num2 + " = " + ans);
            System.out.print("Continue?: ");
            continueAns=sc.next();
        }while (continueAns.equals("Yes"));
    }
}
