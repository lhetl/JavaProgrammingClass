package Assignment.Assignment5.Example8;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        String path= System.getProperty("user.dir")+"\\src\\main\\java\\Assignment\\Assignment5\\Example8\\";
        try (RandomAccessFile inout = new RandomAccessFile(path+"inout.dat", "rw")) {
            inout.setLength(0); // 파일 존재 時 내용 지움

            for (int i = 0; i < 200; i++) inout.writeInt(i);
            System.out.println("현재 파일 길이 " + inout.length());

            // 첫번째 수 검색
            inout.seek(0); System.out.println("1st: " + inout.readInt());

            // 다섯 번째 수 검색; int는 4 bytes.
            inout.seek((5-1) * 4); System.out.println("5th: " + inout.readInt());

            // 일곱 번째 수 변경
            inout.seek((7-1)*4); inout.writeInt(666);

            // 파일 끝에 새로운 수 추가
            inout.seek(inout.length()); inout.writeInt(1111);
        } // end of try
    }
}
