package Assignment.OrientAssignment3.A.Question9_13;

import java.util.Scanner;

public class Test {
    public static Location locateLargest(double[][] a){
        double maxVal=Double.MIN_VALUE;
        Location locate = new Location(0,0,0);
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]>maxVal){
                    maxVal=a[i][j];
                    locate.setRow(i);
                    locate.setColumn(j);
                    locate.setMaxValue(maxVal);
                }
            }
        }
        return locate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        double[][] arr = new double[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        System.out.println(locateLargest(arr).toString());
    }
}
