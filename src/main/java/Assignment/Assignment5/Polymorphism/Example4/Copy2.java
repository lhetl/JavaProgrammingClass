package Assignment.Assignment5.Polymorphism.Example4;

import java.io.*;
public class Copy2 {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        in = new FileReader("sourceFile");
        out = new FileWriter("targetFile");
        int c;
        while ((c = in.read()) != -1) { // EOF 검사
            out.write(c);
        }
        in.close();
        out.close();
    }
}
