package Assignment.Assignment7_add.Exception;

public class NullAccountException extends MainErrorException {
    public NullAccountException() {
        super("존재하지 않는 계좌입니다.");
    }
}
