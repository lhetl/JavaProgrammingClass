package Example.Example2;

public class CheckNum {
    static void analysis(int...a) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        float avg = 0.0F;
        for (int x : a) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            sum += x;
        }
        avg = sum / (a.length);
        System.out.println("  sum: "+sum+"  average: "+avg+"  max: "+max+"  min:  "+min);
    }
    static void analysis(String...args) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        float avg = 0.0F;
        int val=0;
        for (String x : args) {
            val=Integer.parseInt(x);
            if (val> max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
            sum += val;
        }
        avg = sum / (args.length);
        System.out.println("  sum: "+sum+"  average: "+avg+"  max: "+max+"  min:  "+min);
    }

    public static void main(String[] args) {
        analysis(11,22,33);
        analysis(11,22,33,44,55);

        int[] scores1={11,22,33}; analysis(scores1);
        int[] scores2={11,22,33,44,55}; analysis(scores2);

        String[] test1={"11", "22", "33"}; analysis(test1);
        String[] test2={"11", "22", "33","44","55"}; analysis(test2);

    }
}
