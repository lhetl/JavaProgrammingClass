package Assignment.Assignment3.B.Question10_11;

public class Test10_11 {
    public static void main(String[] args) {
        Circle2D c1=new Circle2D(2,2,5.5);
        Circle2D c2=new Circle2D(4,5,10.5);
        Circle2D c3=new Circle2D(3,5,2.3);
        System.out.println(c1.contains(3,3));
        System.out.println(c1.contains(c2));
        System.out.println(c1.contains(c3));
    }
}
