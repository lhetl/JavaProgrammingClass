package Assignment.Assignment7_add.Exception;


public class NotIntegerException extends MainErrorException {
    public NotIntegerException(){
        super("정수를 입력해주세요");
    }
}
