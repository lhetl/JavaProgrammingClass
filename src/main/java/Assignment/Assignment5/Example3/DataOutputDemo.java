package Assignment.Assignment5.Example3;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {
    public static void main(String[] args) throws IOException {
        String path= System.getProperty("user.dir")+"\\src\\main\\java\\Assignment\\Assignment5\\Example3\\";
        // 출력 데이터 스트림 생성
        DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(path+args[0]+".dat")));
        // 쓰기 연산 수행
        dos.writeUTF("김민규");
        dos.writeChar( 'M');
        dos.writeInt( 20230146 );	// writeLong, writeShort, writeByte, ...
        dos.writeFloat( 0.6F);		// writeDouble
        dos.writeBoolean(false);

        // 스트림 닫기
        dos.close();
    }
}

