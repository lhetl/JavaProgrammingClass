package Assignment.Assignment7_add.Dto.Request;

import Assignment.Assignment7_add.Entity.IAccount;

import java.util.List;

public record TransferRequestDto(
        UpdateRequestDto accountWithdraw,
        UpdateRequestDto accountDeposit) {
}
