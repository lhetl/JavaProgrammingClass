package Assignment.Assignment5.Polymorphism.Example6;

public class Test {
    static int divide1(int a, int b){
        int x = 0;
        try {
            x = a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return x;
    }
    static int divide2(int a,int b) throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args) {
        divide1(100000,0);
        divide2(1000000,0);
    }

}
