package Assignment.OrientAssignment4.AccountExample2;

import Example.Example11.Boundary.*;
import Example.Example11.Entity.*;
import Example.Example11.Control.*;
import Assignment.OrientAssignment4.AccountExample2.Boundary.Keyboard;
import Assignment.OrientAssignment4.AccountExample2.Boundary.Screen;
import Assignment.OrientAssignment4.AccountExample2.Control.DepositControl;
import Assignment.OrientAssignment4.AccountExample2.Control.InquiryControl;
import Assignment.OrientAssignment4.AccountExample2.Control.WithdrawControl;
import Assignment.OrientAssignment4.AccountExample2.Entity.IAccount;
import Assignment.OrientAssignment4.AccountExample2.Entity.MinusAccount;
import Assignment.OrientAssignment4.AccountExample2.Entity.NormalAccount;

public class Bank {
    private Screen screen;
    private Keyboard keyBoard;
    private IAccount acc1,acc2;

    public Bank() {
        this.screen = new Screen();
        this.keyBoard = new Keyboard();
        this.acc1 = new NormalAccount(1,10000);
        this.acc2 = new MinusAccount(2,50000,10000);
    }
    public  void run(){
        while(true){
            char command=getCommand();
            if(command=='6') break;
            switch(command){
                case '1': new InquiryControl().execute(acc2,screen); break;
                case '2': new DepositControl().execute(acc2,screen,keyBoard); break;
                case '3': new WithdrawControl().execute(acc2,screen,keyBoard); break;
                default: break;
            }
        }
        keyBoard.end();
        System.out.println("종료됨");
    }
    private char getCommand() {
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
