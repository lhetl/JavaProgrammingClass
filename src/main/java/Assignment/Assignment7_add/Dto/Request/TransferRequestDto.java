package Assignment.Assignment7_add.Dto.Request;

public record TransferRequestDto(
        UpdateRequestDto accountWithdraw,
        UpdateRequestDto accountDeposit) {
}
