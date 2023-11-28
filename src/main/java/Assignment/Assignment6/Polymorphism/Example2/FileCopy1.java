package Assignment.Assignment6.Polymorphism.Example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 { // 예외 처리 방법(1) - 예외 처리기
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in  = new FileInputStream(args[0]);
            out = new FileOutputStream(args[1]);
            int c;
            while ((c = in.read()) != -1) { out.write(c); }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } finally {
            try {
                if (in != null) in.close(); if (out != null) out.close();
            } catch (IOException e) {
            }
        }
    }
}