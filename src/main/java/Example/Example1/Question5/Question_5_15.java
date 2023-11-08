package Example.Example1.Question5;

public class Question_5_15 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=2;j<=9;j++){
                System.out.print(j+ " * "+i+" = ");
                System.out.printf("%2d ",j*i);
            }
            System.out.println();
        }
    }
}
