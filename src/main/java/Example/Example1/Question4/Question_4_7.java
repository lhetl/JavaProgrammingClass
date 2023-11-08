package Example.Example1.Question4;

import java.util.Scanner;

public class Question_4_7 {
    public static void main(String[] args) {
        System.out.print("Score: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        score/=10;
        char rank='F';
        switch(score){
        case 10:
        case 9:
            rank='A';
            break;
        case 8:
            rank='B';
            break;
        case 7:
            rank='C';
            break;
        case 6:
            rank='D';
            break;
        default:
            rank='F';
        }
        sc.close();
        System.out.println("Grade : "+rank);
    }
}
