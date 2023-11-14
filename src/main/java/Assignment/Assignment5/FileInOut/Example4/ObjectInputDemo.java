package Assignment.Assignment5.FileInOut.Example4;

import Assignment.Assignment5.FileInOut.Path;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputDemo {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        String path= Path.getPath(4);
        // 입력 객체 스트림 생성
        ObjectInputStream ois =
                new ObjectInputStream( new FileInputStream(path+args[0]+".dat") );
        // (주의) source file은 반드시 ObjectOutputStream로 write한 파일

        // 객체 읽기 (주의) write한 순서대로 read
        System.out.println( (Date)ois.readObject() );
        // (주의) 타입변환 時 ClassNotFoundException 발생 가능

        // primitive-type 값 읽기
        char c = ois.readChar();			boolean b = ois.readBoolean();
        double d = ois.readDouble();		String s = ois.readUTF();
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
        // 스트림 닫기
        ois.close();
    }
}
