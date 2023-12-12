package Assignment.Assignment7_add.Controller;

import Assignment.Assignment7_add.Dto.Response.*;
import Assignment.Assignment7_add.Entity.IAccount;
import Assignment.Assignment7_add.Dto.Request.UpdateRequestDto;
import Assignment.Assignment7_add.Dto.Request.TransferRequestDto;
import Assignment.Assignment7_add.Dto.Request.OpenRequestDto;
import Assignment.Assignment7_add.Entity.MinusAccount;
import Assignment.Assignment7_add.Entity.NormalAccount;
import Assignment.Assignment7_add.Exception.OverWithdrawException;
import Assignment.Assignment7_add.Exception.ValueErrorException;
import Assignment.Assignment7_add.Repository.AccountRepository;


public class AccountControl {
    private AccountRepository accountRepository;
    public AccountControl(){
        this.accountRepository=new AccountRepository();
    }
    public UpdateResponseDto deposit(UpdateRequestDto dto){
        IAccount account = accountRepository.findById(dto.accountNumber());
        account.deposit(dto.amount());
        return UpdateResponseDto.toDto(account,dto.amount());
    }
    public UpdateResponseDto withdraw(UpdateRequestDto dto){
        IAccount account = accountRepository.findById(dto.accountNumber());
        if (account.withdraw(dto.amount())){
            return UpdateResponseDto.toDto(account, dto.amount());
        }else{
            throw new OverWithdrawException();
        }
    }

    public UpdateResponseDto inquiry(UpdateRequestDto dto){
        IAccount account = accountRepository.findById(dto.accountNumber());
        return UpdateResponseDto.toDto(account,0);
    }
    public TransferResponseDto transfer(TransferRequestDto dto){
        IAccount accountWith = accountRepository.findById(dto.accountWithdraw().accountNumber());
        IAccount accountDepo  = accountRepository.findById(dto.accountDeposit().accountNumber());
        int amount=dto.accountWithdraw().amount();
        if (accountWith.withdraw(amount)) {
            accountDepo.deposit(amount);
            return TransferResponseDto.toDto(accountWith,accountDepo,amount);
        }else {
            throw new OverWithdrawException();
        }
    }
    public OpenResponseDto openAccount(OpenRequestDto dto){
        if (dto.type()=='M'){
            MinusAccount accountM = (MinusAccount) dto.toEntity(accountRepository.getLastNumber());
            accountRepository.saveAccount(accountM);
            return OpenResponseDto.toDto(accountM);
        }else if (dto.type()=='N'){
            NormalAccount accountN = (NormalAccount) dto.toEntity(accountRepository.getLastNumber());
            accountRepository.saveAccount(accountN);
            return OpenResponseDto.toDto(accountN);
        }else{
            throw new ValueErrorException();
        }

    }

}
