package Example.Example1.Question5;


import java.util.Scanner;

public class Question_5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=1,num1,cnt=-1,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        do {
            System.out.print("input: ");
            num1 = sc.nextInt();
            cnt++;
            ans+=num1;
            if (num1>max){
                max=num1;
            }
            if (num1<min && num1!=-1){
                min=num1;
            }
        }while (num1!=-1);
        System.out.println("최댓값: "+max);
        System.out.println("최솟값: "+min);
        System.out.println("평균: "+(double)ans/cnt);
    }
}

