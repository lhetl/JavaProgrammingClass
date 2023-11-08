package TestClass;

import java.util.Scanner;

public class TestStar{

    public static void main(String[] args) {
        int count = 0;
        for (int year=2023;year<=2123;year++){
            if ((year%4==0 && year%100!=0) || (year%400==0))
            System.out.print(year+((++count%10==0)? "\n" : " "));
        }
    }
}