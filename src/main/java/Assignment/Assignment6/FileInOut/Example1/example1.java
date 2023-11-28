package Assignment.Assignment6.FileInOut.Example1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class example1{
    public static void main(String[]args){
        FileInputStream in=null;FileOutputStream out=null;
        try{
            in=new FileInputStream(args[0]);    // file open 시
            out=new FileOutputStream(args[1]);    // FileNotFoundException 발생 가능

            int c;
            while((c=in.read())!=-1) {       // read, write 시
                out.write(c);
            }// IOException 발생 가능
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());    // e.printStackTrace()
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{if(in!=null)in.close();}catch(IOException e){}
            try{if(out!=null)out.close();}catch(IOException e){}
        }
    }
}