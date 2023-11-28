package Assignment.Assignment6.FileInOut.Example5;

import java.io.*;
class Order implements Serializable { // 객체 읽기/쓰기 위해 필수
    private String title;
    private float price;
    private int unit;

    public Order(String t, float p, int u) {
        title = t;
        price = p;
        unit = u;
    }
    public String getTitle(){
        return title;
    }
    public float getPrice(){
        return price;
    }
    public int getUnit(){
        return unit;
    }
}
