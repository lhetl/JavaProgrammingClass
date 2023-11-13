package Assignment.Assignment3.A.Question9_6;

public class Test9_6 {
    public static void main(String[] args) {
        StopWatch sw1=new StopWatch();
        int[] arr=new int[100000];
        for(int i=0;i<100000;i++){
            arr[i]=100000-i;
        }
        sw1.start();
        selectionSort(arr);
        sw1.stop();
        System.out.println(sw1.getElapsedTime());
    }
    public static void selectionSort(int[] a){
        int min=0;
        int tmp=0;
        for(int i=0;i<a.length-1;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if (a[j]<a[min]){
                    min=j;
                }
            }
            swap(a,min,i);
        }
    }
    private static void swap(int[]a, int i, int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

}
