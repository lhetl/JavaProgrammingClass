package Assignment.Assignment7_add.Dto.Response;

import Assignment.Assignment7_add.Entity.MinusAccount;

public record OpenMinusResponseDto(
        String accountType,
        int baseAmount,
        int creditAmount,
        int accountNumber){
    public static OpenMinusResponseDto toDto(MinusAccount minusAccount){
        return new OpenMinusResponseDto("Minus",minusAccount.getBalance(),minusAccount.getCreditAmount(), minusAccount.getAccountNumber());
    }public String toString(){
        return "계좌 번호: "+this.accountNumber+"  금액: "+this.baseAmount+" 한도 금액: "+this.creditAmount+"인 \n"+this.accountType+"계좌가 생성되었습니다";
    }
}