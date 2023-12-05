package Assignment.Assignment7_add.Dto.Response;

import Assignment.Assignment7_add.Entity.IAccount;

public record TransferResponseDto(
        UpdateResponseDto accountWithdraw,
        UpdateResponseDto accountDeposit){
    public static TransferResponseDto toDto(IAccount account1, IAccount account2, int amount){
        return new TransferResponseDto(
                UpdateResponseDto.toDto(account1,amount),
                UpdateResponseDto.toDto(account2,amount));
    }
    public String toString(){
        return "계좌번호" + accountWithdraw.accountId()+ "번 계좌의 잔고는 " + accountWithdraw.leftAmount() + " 입니다. \n("+ accountWithdraw.updateAmount()+"원 출금)"+
                "\n계좌번호" + accountDeposit.accountId()+ "번 계좌의 잔고는 " + accountDeposit.leftAmount() + " 입니다. \n("+ accountDeposit.updateAmount()+"원 입금)";
    }
}
