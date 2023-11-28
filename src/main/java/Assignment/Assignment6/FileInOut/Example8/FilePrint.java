package Assignment.Assignment6.FileInOut.Example8;

import Assignment.Assignment6.FileInOut.Path;

import java.io.IOException;
import java.io.RandomAccessFile;

class FilePrint {
    public static void main (String args[]) throws IOException {
        char c;
        String path= Path.getPath(8);

        RandomAccessFile file = new RandomAccessFile(path+args[0], "rw");

        while ( file.getFilePointer() < file.length() )
            System.out.println(file.readLine());
    }
}
