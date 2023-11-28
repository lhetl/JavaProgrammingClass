package Assignment.Assignment6.FileInOut;

public class Path {
    static final String path= System.getProperty("user.dir")+"\\src\\main\\java\\Assignment\\Assignment6\\FileInOut\\Example";
    public static String getPath(long val) {
        return path+val+"\\";
    }

}
