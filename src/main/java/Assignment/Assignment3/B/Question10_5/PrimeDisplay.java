package Assignment.Assignment3.B.Question10_5;

import java.util.Scanner;

public class PrimeDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int tmp=2;
        StackOfInteger stack=new StackOfInteger();
        while(num!=1){
            if (num%tmp==0){
                stack.push(tmp);
                num/=tmp;
                tmp=1;
            }
            tmp+=1;
        }

        StackOfInteger reverseStack=new StackOfInteger();
        while(!stack.empty())
        {
            reverseStack.push(stack.pop());
        }


        while(!reverseStack.empty()){
            System.out.print(reverseStack.pop()+" , ");
        }
        System.out.println("\b\b");
        sc.close();
    }
}
