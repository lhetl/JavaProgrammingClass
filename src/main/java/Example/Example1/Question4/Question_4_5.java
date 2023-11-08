package Example.Example1.Question4;

import java.util.Scanner;

public class Question_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("char?: ");
        char ch = sc.next().charAt(0);
        char[] arr= {'a','e','i','o','u','A','E','I','O','U'};
        String ans="Consonant";
        for (char tmp: arr){
            if (ch==tmp){
                ans="Vowel";
                break;
            }
        }
        System.out.println(ch+" is "+ans);
    }
}
