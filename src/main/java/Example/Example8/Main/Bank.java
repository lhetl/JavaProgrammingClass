package Example.Example8.Main;

import Example.Example8.Boundary.Screen;
import Example.Example8.Control.*;
import Example.Example8.Entity.Account;
import Example.Example8.Boundary.KeyBoard;
import OrientExam.Control.*;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private Screen screen;
    private KeyBoard keyBoard;
    private List<Account> accountList=new ArrayList<>();

    public Bank() {
        this.screen = new Screen();
        this.keyBoard = new KeyBoard();
        this.accountList.add(new Account("홍길동",10000));
        this.accountList.add(new Account("홍판서",50000));
    }
    public void run(){
        while(true){
            char command = getCommand();
            if(command=='6'){
                break;
            }
            int pk=0;
            Account account;
            switch(command){
                case '1':
                    InquiryControl ic = new InquiryControl();
                    screen.displayPrompt("계좌 번호를 입력하세요");
                    pk=keyBoard.getInt()-1;
                    account=accountList.get(pk);
                    ic.execute(account,screen); break;
                case '2':
                    DepositControl dc = new DepositControl();
                    screen.displayPrompt("계좌 번호를 입력하세요");
                    pk=keyBoard.getInt()-1;
                    account=accountList.get(pk);
                    dc.execute(account,screen,keyBoard); break;
                case '3':
                    WithdrawControl wc = new WithdrawControl();
                    screen.displayPrompt("계좌 번호를 입력하세요");
                    pk=keyBoard.getInt()-1;
                    account=accountList.get(pk);
                    wc.execute(account,screen,keyBoard); break;
                case '4':
                    TransferControl tc = new TransferControl();
                    screen.displayPrompt("첫번째 계좌 번호를 입력하세요");
                    pk=keyBoard.getInt()-1;
                    Account account1=accountList.get(pk);
                    screen.displayPrompt("두번째 계좌 번호를 입력하세요");
                    pk=keyBoard.getInt()-1;
                    Account account2=accountList.get(pk);
                    new TransferControl().execute(account1,account2,screen,keyBoard); break;
                case '5':
                    OpenControl oc= new OpenControl();
                    accountList.add(oc.execute(screen,keyBoard));
                    break;
                default : break;
            }
        }
        System.out.println("종료됨");
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
