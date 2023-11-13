package Assignment.Assignment3.B.Question10_3;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public static boolean isEven(int val){
        return (val%2==0);
    }
    public static boolean isOdd(int val){
        return (val%2==1);
    }
    public static boolean isPrime(int val){
        boolean check=true;
        for(int i=2;i<Math.sqrt(val);i++){
            if (val%i==0){
                check=false;
            }
        }
        return check;
    }
    public boolean isEven(){
        return isEven(this.value);
    }
    public boolean isOdd(){
        return isEven(this.value);
    }
    public boolean isPrime(){
        return isPrime(this.value);
    }
    public static boolean isEven(MyInteger myInteger){
        return isEven(myInteger.getValue());
    }
    public static boolean isOdd(MyInteger myInteger){
        return isOdd(myInteger.getValue());
    }
    public static boolean isPrime(MyInteger myInteger){
        return isPrime(myInteger.getValue());
    }
    public boolean equals(int val){
        return (val==this.value);
    }
    public boolean equals(MyInteger myInteger){
        return (myInteger.getValue() == this.value);
    }
    public static int parseInt(char[] arr){
        int tmp=0;
        for(char chr : arr){
            tmp=tmp*10+(int)chr-'0';
        }
        return tmp;
    }
    public static int parseInt(String str){
        return parseInt(str.toCharArray());
    }

}
