package Example.Example1.Question4;

import java.util.Scanner;

public class Question_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("char 입력:");
        char c=sc.next().charAt(0);
        if (c>='a' && c<='z'){
            System.out.println(c+"는 소문자"+"\n"+c+"의 대문자는"+(char)(c-'a'+'A'));

        }else if (c>='A' && c<='Z'){
            System.out.println(c+"는 대문자"+"\n"+c+"의 소문자는"+(char)(c-'A'+'a'));
        }else{
            System.out.println(c+"는 문자가 아님");
        }

    }
}
