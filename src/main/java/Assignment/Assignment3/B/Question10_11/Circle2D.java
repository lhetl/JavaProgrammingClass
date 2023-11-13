package Assignment.Assignment3.B.Question10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    private final int maxLength=2;
    private final double pi=Math.round(Math.PI* Math.pow(10,maxLength))/Math.pow(10,maxLength);

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public Circle2D(){
        this.x=0;
        this.y=0;
        this.radius=1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public boolean contains(Circle2D circle2D){
        return this.radius>(getDistance(circle2D.x,circle2D.y)+ circle2D.getRadius());
    }
    public boolean contains(double x,double y){
        Circle2D tmp= new Circle2D(x,y,0);
        return contains(tmp);
    }
    public boolean overlaps(Circle2D circle2D){
        double sum=Math.pow(circle2D.getRadius()+this.radius,2);
        return getDistance(circle2D.x, circle2D.y)<sum;
    }
    private double getDistance(double x,double y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
}
