package Assignment.Assignment5.Polymorphism.Example7;

import java.io.File;

public class Delete {
    public static void main(String... args) {
        try {
            File f = new File(args[0]);

            if ( !f.exists() )
                throw new IllegalArgumentException("파일 없음: " + args[0]);
            if ( !f.canWrite() )
                throw new IllegalArgumentException("쓰기 방지: " + args[0]);
            if ( f.isDirectory() && f.list().length>0 )
                throw new IllegalArgumentException("빈 디렉토리 아님: " + args[0]);
            if ( !f.delete() )
                throw new IllegalArgumentException("삭제 실패");
        } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}

