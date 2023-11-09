package Assignment.Assignment5.Polymorphism.Example4;

import java.io.*;
public class Copy1 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("sourceFile");
            out = new FileWriter("targetFile");
            int c;
            while ((c = in.read()) != -1) { // EOF 검사
                out.write(c);
            }
            in.close();
            out.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}