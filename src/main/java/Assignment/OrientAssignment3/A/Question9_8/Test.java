package Assignment.OrientAssignment3.A.Question9_8;

public class Test {
    public static void main(String[] args) {
        Fan f1=new Fan();
        f1.setSpeed(3);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        Fan f2=new Fan();
        f2.setSpeed(2);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
