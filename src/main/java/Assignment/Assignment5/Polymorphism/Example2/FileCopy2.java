package Assignment.Assignment5.Polymorphism.Example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 { // 예외 처리 방법(1) - 예외 전파
    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        in  = new FileInputStream(args[0]);
        out = new FileOutputStream(args[1]);

        int c;
        while ((c = in.read()) != -1) { //eof 검사
            out.write(c);
        }

        in.close();
        out.close();
    }
}
