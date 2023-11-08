package TestClass;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST= 3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius = 5.0;
    public Fan(){
        speed=SLOW;
        on=false;
        radius=5.0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void displayCurrentState() {
        System.out.println("speed: "+this.speed+"on: "+on+"radius: "+radius);
    }

}
