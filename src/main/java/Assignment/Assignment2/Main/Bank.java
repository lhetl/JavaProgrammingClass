package Assignment.Assignment2.Main;

import Assignment.Assignment2.Boundary.KeyBoard;
import Assignment.Assignment2.Boundary.Screen;
import Assignment.Assignment2.Control.DepositControl;
import Assignment.Assignment2.Control.InquiryControl;
import Assignment.Assignment2.Control.TransferControl;
import Assignment.Assignment2.Control.WithdrawControl;
import Assignment.Assignment2.Entity.Account;

class Bank {
    private Screen screen;
    private KeyBoard keyBoard;
    private Account acc1, acc2;

    public Bank() {
        this.screen = new Screen();
        this.keyBoard = new KeyBoard();
        acc1 = new Account("홍길동", 10000);
        acc2 = new Account("홍판서", 50000);

    }
    public void run(){
        while(true){
            char command = getCommand();
            if(command=='6'){
                break;
            }
            switch(command){
                case '1':
                    new InquiryControl().execute(acc1,screen); break;
                case '2':
                    new DepositControl().execute(acc1,screen,keyBoard); break;
                case '3':
                    new WithdrawControl().execute(acc1,screen,keyBoard); break;
                case '4':
                    new TransferControl().execute(acc1,acc2,screen,keyBoard); break;
//                case '5':
//                    new OpenControl();
                default : break;
            }
        }
        System.out.println("Terminated");
    }
    private char getCommand(){
        System.out.println("\n\n\t\tM e n u");
        System.out.println("\t\t\t (1) Balance Inquiry");
        System.out.println("\t\t\t (2) Deposit");
        System.out.println("\t\t\t (3) Withdraw");
        System.out.println("\t\t\t (4) Account Transfer");
        System.out.println("\t\t\t (5) Account Opening");
        System.out.println("\t\t\t (6) Terminate");
        screen.displayPrompt("\n\t\t번호를 입력하시오: ");
        return keyBoard.getSelection();
    }
}
