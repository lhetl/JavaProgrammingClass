package Assignment.Assignment7_add.Boundary;

import Assignment.Assignment7_add.Controller.AccountControl;
import Assignment.Assignment7_add.Dto.Request.UpdateRequestDto;
import Assignment.Assignment7_add.Entity.GUI.MainGUI;

public class GUIBoundary {
    private MainGUI mainGUI;
    private AccountControl accountControl;
    public GUIBoundary(){
        this.gui=new MainGUI();
        accountControl=new AccountControl();
        gui.display();
        gui.getDepositButton().addActionListener(e -> handleDeposit());
    }
    private handleDeposit(){
        int accountNumber=gui.getNumberTextInt();
        int amount=
        UpdateRequestDto dto = new UpdateRequestDto()
        this.accountControl.deposit(dto);
    }

}
