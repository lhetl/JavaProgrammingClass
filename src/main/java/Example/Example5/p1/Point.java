package Example.Example5.p1;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setXY(int x,int y) {
        this.x = x;
        this.y=y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
