package Assignment.Assignment4.B.Question10_3;

public class Test10_3 {
    public static void main(String[] args) {
        MyInteger oddInteger = new MyInteger(7);
        MyInteger evenInteger = new MyInteger(8);
        MyInteger primeInteger = new MyInteger(11);
        MyInteger equalsInteger1= new MyInteger(13);
        MyInteger equalsInteger2= new MyInteger(13);
        char[] chArr={'1','3','4'};
        String strNum="134";
        System.out.println(oddInteger.isOdd());
        System.out.println(evenInteger.isEven());
        System.out.println(primeInteger.isPrime());
        System.out.println(MyInteger.isOdd(11));
        System.out.println(MyInteger.isEven(14));
        System.out.println(MyInteger.isPrime(17));
        System.out.println(MyInteger.isOdd(oddInteger));
        System.out.println(MyInteger.isEven(evenInteger));
        System.out.println(MyInteger.isPrime(primeInteger));
        System.out.println(equalsInteger1.equals(13));
        System.out.println(equalsInteger1.equals(equalsInteger2));
        System.out.println(MyInteger.parseInt(chArr));
        System.out.println(MyInteger.parseInt(strNum));
    }
}
