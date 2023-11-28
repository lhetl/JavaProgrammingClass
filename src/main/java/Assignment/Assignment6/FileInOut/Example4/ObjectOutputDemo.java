package Assignment.Assignment6.FileInOut.Example4;

import Assignment.Assignment6.FileInOut.Path;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputDemo {
    public static void main(String[] args) throws IOException {
        String path= Path.getPath(4);
        // 출력 객체 스트림 생성
        ObjectOutputStream oos =
                new ObjectOutputStream( new FileOutputStream(path+args[0]+".dat") );

        // 객체 쓰기
        oos.writeObject( new Date() ); // (주의) Serializable 객체

        // primitive-type 값 쓰기도 가능함
        oos.writeChar('A');
        oos.writeBoolean(true);
        oos.writeDouble(100.0);
        oos.writeUTF("abc");

        // 스트림 닫기
        oos.close();
    }
}
