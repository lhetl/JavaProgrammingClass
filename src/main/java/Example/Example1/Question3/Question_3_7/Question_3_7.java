package Example.Example1.Question3.Question_3_7;

import java.io.File;
import java.util.Scanner;

public class Question_3_7 {
    public static void main(String[] args) throws FileErrorException {
        try{
            Scanner sc = new Scanner(System.in);
            Scanner sc2= new Scanner(new File("C:\\Users\\hyun9\\Desktop\\data.txt"));
            System.out.print("문자열 입력: ");
            System.out.println(sc.nextLine()+" "+sc2.nextLine());
        }catch (Exception e){
            throw new FileErrorException("파일에서 문제가 발생했습니다");
        }
    }
}
