package Assignment.Assignment5.Example6;

import java.io.*;
import java.util.*;

class FileInfo {
    public static void main(String[] args) throws IOException {
        String path= System.getProperty("user.dir")+"\\src\\main\\java\\Assignment\\Assignment5\\Example6\\";
        File f = new File(path, "FileInfo.java"); // d:\src\io\FileInfo.java
        if (f.exists()) {
            if (f.isFile()) { // file 정보 출력
                System.out.println( f.getParent() );	// .\..\io
                System.out.println( f.getName() ); 	// FileInfo.java
                System.out.println( f.getPath() ); 	// .\..\io\FileInfo.java
                System.out.println( f.getAbsolutePath() ); // D:\src\io\.\..\io\FileInfo.java
                System.out.println( f.getCanonicalPath()); // D:\src\io\FileInfo.java
                System.out.println( f.length());	// size in bytes
                System.out.println(new Date(f.lastModified()));// 최근 변경 시각
            } else {  // directory listing
                String[] names = f.list();
                for (String x : names)
                    System.out.println(x);
            }
        } // outer if
    } // main
}

