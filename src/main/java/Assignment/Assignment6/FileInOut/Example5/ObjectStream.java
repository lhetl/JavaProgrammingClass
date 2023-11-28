package Assignment.Assignment6.FileInOut.Example5;

import Assignment.Assignment6.FileInOut.Path;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        String path= Path.getPath(5);
        Order[] orders = {
                new Order("10분의 기적", 10.0f, 10),
                new Order("소크라테스에서 포스트모드니즘까지", 20.0f, 100),
                new Order("괴테와의 대화", 30.0f, 1000)
        };

        ObjectOutputStream out =
                new ObjectOutputStream( new FileOutputStream(path+"orders.txt") );

        for (Order o : orders)
            out.writeObject(o);

        out.close();
        float total=0.0f;
        ObjectInputStream in =
                new ObjectInputStream( new FileInputStream(path+"orders.txt") );

        for (Order o : orders) {
            o = (Order)in.readObject();
            System.out.format("You ordered %d unit of %s at $%.1f%n",
                    o.getUnit(), o.getTitle(), o.getPrice());
            total += o.getUnit() * o.getPrice();
        }
        System.out.format("Total: %.2f$", total);

        in.close();
    } // end of main
}

