package Assignment.Assignment5.Example6;

import java.io.File;
import java.io.IOException;
import java.util.Date;

class FileInfo2 {
    public static void main(String[] args) throws IOException {
        String path= System.getProperty("user.dir")+"\\src\\main\\java\\Assignment\\Assignment5\\Example6\\";
        File f = new File(path+args[0]); //args : 파일 이름 입력
        if (f.exists()) {
            if (f.isFile()) printProperty(f); // long format
            else {
                File[] entries = f.listFiles(); // directory listing
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

