package Example.Example3;

public class Triangle {
    static float findArea(int a, int h){
        return (float) (a * h) /2;
    }
    static float findArea(int a,int b, int c){
        float tmp=(a+b+c)/2;
        float ans= (float) Math.sqrt((double)(tmp*(tmp-a)*(tmp-b)*(tmp-c)));
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findArea(10,20));
        System.out.println(findArea(10,15,20));
    }
}
