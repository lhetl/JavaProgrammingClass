package Assignment.Assignment7_add.Boundary;

import Assignment.Assignment7_add.Controller.AccountControl;
import Assignment.Assignment7_add.Dto.Request.OpenRequestDto;
import Assignment.Assignment7_add.Dto.Request.TransferRequestDto;
import Assignment.Assignment7_add.Dto.Request.UpdateRequestDto;
import Assignment.Assignment7_add.Dto.Response.*;
import Assignment.Assignment7_add.Entity.GUI.MainGUI;

public class GUIBoundary {
    private MainGUI mainGUI;
    private AccountControl accountControl;
    public GUIBoundary(){
        this.mainGUI=new MainGUI();
        accountControl=new AccountControl();
        mainGUI.display();
        mainGUI.getDepositButton().addActionListener(e -> handleDeposit());
        mainGUI.getWithdrawButton().addActionListener(e->handleWithdraw());
        mainGUI.getBalanceButton().addActionListener(e->handleInquiry());
        mainGUI.getOpenButton().addActionListener(e->handleOpen());
        mainGUI.getTransferButton().addActionListener(e->handleTransfer());
    }
    private void handleDeposit(){
        int accountNumber=mainGUI.getAccountNumberInt();
        int amount= mainGUI.getAmountText();
        UpdateRequestDto dto = new UpdateRequestDto(accountNumber,amount);
        UpdateResponseDto responseDto = this.accountControl.deposit(dto);
        mainGUI.setText(responseDto.toStringDeposit());
    }
    private void handleWithdraw(){
        int accountNumber=mainGUI.getAccountNumberInt();
        int amount= mainGUI.getAmountText();
        UpdateRequestDto dto = new UpdateRequestDto(accountNumber,amount);
        UpdateResponseDto responseDto = this.accountControl.withdraw(dto);
        mainGUI.setText(responseDto.toStringWithdraw());
    }
    private void handleInquiry(){
        int accountNumber=mainGUI.getAccountNumberInt();
        UpdateRequestDto dto = new UpdateRequestDto(accountNumber,0);
        UpdateResponseDto responseDto = this.accountControl.inquiry(dto);
        mainGUI.setText(responseDto.tostringinquiry());
    }
    private void handleTransfer(){
        int[] accountNumber=mainGUI.getAccountNumberSplit(2,",");
        int amount=mainGUI.getAmountText();
        UpdateRequestDto withdraw = new UpdateRequestDto(accountNumber[0],amount);
        UpdateRequestDto deposit = new UpdateRequestDto(accountNumber[1],amount);
        TransferRequestDto dto = new TransferRequestDto(withdraw,deposit);
        TransferResponseDto responseDto=this.accountControl.transfer(dto);
        mainGUI.setText(responseDto.toString());
    }
    private void handleOpen(){
        String[] tmp=mainGUI.getAmountSplitInt(",");
        char type='N';
        if (tmp.length==2){
            type='M';
        }else if (tmp.length==1){
            type='N';
        }
        int amount = Integer.parseInt(tmp[0]);
        int credit=0;

        if (type == 'M') {
            credit = Integer.parseInt(tmp[1]);
        }
        OpenResponseDto responseDto = this.accountControl.openAccount(new OpenRequestDto(type, amount, credit));
        mainGUI.setText(responseDto.toString());
    }
}
