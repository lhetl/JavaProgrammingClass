package Assignment.Assignment5.FileInOut.Example1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class example3 {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream(args[0]);
             FileOutputStream out = new FileOutputStream(args[1])) {
            int c;
            while ((c = in.read()) != -1) out.write(c);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
