package Assignment.Assignment5.Example8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class FilePrint {
    public static void main (String args[]) throws IOException {
        char c;
        String path= System.getProperty("user.dir")+"\\src\\main\\java\\Assignment\\Assignment5\\Example8\\";

        RandomAccessFile file = new RandomAccessFile(path+args[0]+".dat", "rw");

        while ( file.getFilePointer() < file.length() )
            System.out.println(file.readLine());
    }
}
