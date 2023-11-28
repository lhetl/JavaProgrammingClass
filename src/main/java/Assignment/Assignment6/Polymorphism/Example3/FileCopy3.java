package Assignment.Assignment6.Polymorphism.Example3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy3 { // 예외 처리 방법(1) - 예외 처리기
    public static void main(String[] args) {
        try (FileInputStream in  = new FileInputStream(args[0]);
             FileOutputStream out = new FileOutputStream(args[1])){
            int c;
            while ((c = in.read()) != -1) { out.write(c); }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}