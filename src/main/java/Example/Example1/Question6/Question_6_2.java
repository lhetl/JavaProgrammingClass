package Example.Example1.Question6;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_6_2 {
    public static BigInteger fatori(int num, BigInteger[] arr){
        if (arr[num]!=null){
            return arr[num];
        }
        if (num==0 || num==1){
            arr[num]= BigInteger.valueOf(1);
            return arr[num];
        }
        BigInteger thisVal=BigInteger.valueOf(num);
        BigInteger before=fatori(num-1,arr);

        arr[num]=thisVal.multiply(before);
        return arr[num];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=sc.nextInt();
        BigInteger[] arr = new BigInteger[max+1];
        System.out.println(fatori(max,arr));
    }
}
