package Assignment.Assignment7_add.Dto.Response;

import Assignment.Assignment7_add.Entity.IAccount;

public record UpdateResponseDto(
        int accountId,
        int updateAmount,
        int leftAmount) {
    public static UpdateResponseDto toDto(IAccount account, int amount){
        return new UpdateResponseDto(account.getAccountNumber(),amount,account.getBalance());
    }
    public String toStringDeposit(){
        return "계좌번호" +this.accountId+ "번 계좌의 잔고는 " + this.leftAmount + " 입니다. \n("+ this.updateAmount+"원 입금)";
    }
    public String toStringWithdraw(){
        return "계좌번호" + this.accountId+ "번 계좌의 잔고는 " + this.leftAmount + " 입니다. \n("+ this.updateAmount+"원 출금)";
    }
    public String tostringinquiry(){
        return "계좌번호" + this.accountId+ "번 계좌의 잔고는 " + this.leftAmount + " 입니다.";
    }

}
