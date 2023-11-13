package Assignment.Assignment3.B.Question10_1;

public class Test10_1 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        Time t3 = new Time(5,23,55);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }
}
