package Assignment.Assignment7_add.Dto.Response;

import Assignment.Assignment7_add.Entity.NormalAccount;

public record OpenNormalResponseDto(
        String accountType,
        int baseAmount,
        int accountNumber) {
    public static OpenNormalResponseDto toDto(NormalAccount normalAccount){
        return new OpenNormalResponseDto("Normal",normalAccount.getBalance(),normalAccount.getAccountNumber());
    }
    public String toString(){
        return "계좌 번호: "+this.accountNumber+"  금액: "+this.baseAmount+"인 \n"+this.accountType+"계좌가 생성되었습니다";
    }
}
