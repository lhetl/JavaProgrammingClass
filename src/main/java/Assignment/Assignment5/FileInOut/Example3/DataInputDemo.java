package Assignment.Assignment5.FileInOut.Example3;

import Assignment.Assignment5.FileInOut.Path;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputDemo {
    public static void main(String[] args) throws IOException {
        String path = Path.getPath(3);
        // 입력 데이터 스트림 생성 – 소스파일은 반드시 DataOutputStream을 통해 write한 파일
        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(new FileInputStream(path+args[0]+".dat")) );

        // 읽기 연산 수행 - write한 순서대로 read
        System.out.println( dis.readUTF() );
        System.out.println( dis.readChar() );
        System.out.println( dis.readInt() );
        System.out.println( dis.readFloat() );
        System.out.println( dis.readBoolean() );

        // 스트림 닫기
        dis.close();
    }
}
