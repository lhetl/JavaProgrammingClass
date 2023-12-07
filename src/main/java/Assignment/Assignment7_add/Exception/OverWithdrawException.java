package Assignment.Assignment7_add.Exception;

public class OverWithdrawException extends MainErrorException{
    public OverWithdrawException(){
        super("출금할 수 있는 한도를 넘었습니다");
    }
}
