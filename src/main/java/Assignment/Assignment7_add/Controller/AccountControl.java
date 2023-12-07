package Assignment.Assignment7_add.Controller;

import Assignment.Assignment7_add.Entity.IAccount;
import Assignment.Assignment7_add.Dto.Request.UpdateRequestDto;
import Assignment.Assignment7_add.Dto.Request.TransferRequestDto;
import Assignment.Assignment7_add.Dto.Request.OpenRequestDto;
import Assignment.Assignment7_add.Dto.Response.OpenMinusResponseDto;
import Assignment.Assignment7_add.Dto.Response.OpenNormalResponseDto;
import Assignment.Assignment7_add.Dto.Response.TransferResponseDto;
import Assignment.Assignment7_add.Dto.Response.UpdateResponseDto;
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
    public OpenMinusResponseDto openMinus(OpenRequestDto dto){
        MinusAccount account = (MinusAccount) dto.toEntity(accountRepository.getLastNumber());
        accountRepository.saveAccount(account);
        return OpenMinusResponseDto.toDto(account);
    }
    public OpenNormalResponseDto openNormal(OpenRequestDto dto){
        NormalAccount account =(NormalAccount) dto.toEntity(accountRepository.getLastNumber());
        accountRepository.saveAccount(account);
        return OpenNormalResponseDto.toDto(account);
    }

}
