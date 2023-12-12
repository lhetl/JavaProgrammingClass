package Assignment.Assignment7_add.Dto.Response;

import Assignment.Assignment7_add.Entity.MinusAccount;
import Assignment.Assignment7_add.Entity.NormalAccount;

public record OpenResponseDto(
        String accountType,
        int baseAmount,
        int creditAmount,
        int accountNumber){
    public static OpenResponseDto toDto(MinusAccount minusAccount){
        return new OpenResponseDto("Minus",minusAccount.getBalance(),minusAccount.getCreditAmount(), minusAccount.getAccountNumber());
    }
    public static OpenResponseDto toDto(NormalAccount normalAccount){
        return new OpenResponseDto("Normal",normalAccount.getBalance(),0, normalAccount.getAccountNumber());
    }
    public String toString(){
        if (this.accountType=="Minus"){
            return "계좌 번호: "+this.accountNumber+"  금액: "+this.baseAmount+" 한도 금액: "+this.creditAmount+"인 \n"+this.accountType+"계좌가 생성되었습니다";
        }else if (this.accountType=="Normal") {
            return "계좌 번호: " + this.accountNumber + "  금액: " + this.baseAmount + "인 \n" + this.accountType + "계좌가 생성되었습니다";
        }else{
                return "계좌 번호: "+this.accountNumber+"  금액: "+this.baseAmount+"인 \n"+this.accountType+"계좌가 생성되었습니다";
        }
    }
}
