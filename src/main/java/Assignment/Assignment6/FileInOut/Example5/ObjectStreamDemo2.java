package Assignment.Assignment6.FileInOut.Example5;

import Assignment.Assignment6.FileInOut.Path;

import java.io.*;

public class ObjectStreamDemo2 {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        String path= Path.getPath(5);
        Order[] orders = {
                new Order("10분의 기적",    10.0f, 10),
                new Order("소크라테스에서", 20.0f, 100),
                new Order("논어",           30.0f, 10000)
        };

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream(path+"orders2.txt"));

        out.writeObject(orders); // 배열도 객체이므로 한 번의 writeObjet()로 씀
        out.close();

        float total=0.0f;
        Order[] ords;
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream(path+"orders2.txt"));

        ords = (Order[])in.readObject(); // 한 번의 readObject()로 읽음
        for (Order o : ords) {
            System.out.format("You ordered %d unit of %s at $%.1f%n",
                    o.getUnit(), o.getTitle(), o.getPrice());
            total += o.getUnit() * o.getPrice();
        }
        System.out.format("Total: %.2f$", total);

        in.close();
    } // end of main()
} // end of class DataStream2
