package Assignment.Assignment5.FileInOut.Example2;

import Assignment.Assignment5.FileInOut.Path;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        String path= Path.getPath(2);
        try (BufferedReader in = new BufferedReader(new FileReader(path+"in.txt"));
             PrintWriter out = new PrintWriter(new FileWriter(path+"out.txt"))) {
            String s;
            while ((s = in.readLine()) != null) {    //라인 단위 입력; EOF 검사
                out.println(s);                        //라인 단위 출력
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
