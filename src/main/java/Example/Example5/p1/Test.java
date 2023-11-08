package Example.Example5.p1;

//import Example.Example5.p1.Point;

public class Test implements Cloneable {
    public static void main(String[] args) {
        Point p=new Point(0,0);
        p.setXY(3,4);
        System.out.print(p.getX());
//        System.out.print(p.x); //x private 라 안됨 getX get Y만 가능 혹은 x public
    }
}

