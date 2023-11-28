package Assignment.Assignment6.FileInOut.Example6;

import Assignment.Assignment6.FileInOut.Path;

import java.io.File;
import java.io.IOException;
import java.util.Date;

class FileInfo2 {
    public static void main(String[] args) throws IOException {
        String path= Path.getPath(6);
        File f = new File(path+args[0]);
        if (f.exists()) {
            if (f.isFile()) printProperty(f);
            else {
                File[] entries = f.listFiles();
                for (File x : entries) printProperty(x);
            }
        }
    }
    private static void printProperty(File f) throws IOException {
        System.out.print(f.getCanonicalPath());
        System.out.print("\t" + f.length());
        System.out.println("\t" + new Date(f.lastModified()));
    }
}

