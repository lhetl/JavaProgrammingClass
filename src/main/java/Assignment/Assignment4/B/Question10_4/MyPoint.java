package Assignment.Assignment4.B.Question10_4;

public class MyPoint {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(double x,double y){
        MyPoint tmpPoint= new MyPoint(x,y);
        return distance(this,tmpPoint);
    }
    public double distance(MyPoint point){
        return distance(this,point);
    }
    public static double distance(MyPoint point1,MyPoint point2){
        double xDiv=Math.abs(point1.x-point2.x);
        double yDiv=Math.abs(point1.y-point2.y);
        double tmp= Math.sqrt(Math.pow(xDiv,2)+Math.pow(yDiv,2));
        return tmp;
    }
}
