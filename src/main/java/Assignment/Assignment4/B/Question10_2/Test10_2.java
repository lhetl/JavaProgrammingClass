package Assignment.Assignment4.B.Question10_2;

public class Test10_2 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("test", 20, 60.4, 4, 7);
        BMI bmi2 = new BMI("test", 20, 75.4, 4, 2);
        BMI bmi3 = new BMI("test", 20, 95.4, 3, 7);
        System.out.println(bmi1.getStatus());
        System.out.println(bmi2.getStatus());
        System.out.println(bmi3.getStatus());
    }
}
