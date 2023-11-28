package Assignment.Assignment7.Control;

import Assignment.Assignment7.Boundary.Screen;
import Assignment.Assignment7.Entity.IAccount;
import Assignment.Assignment7.Entity.MinusAccount;
import Assignment.Assignment7.Entity.NormalAccount;

import java.util.List;

public class GUIOpenControl {
    public IAccount execute(List<IAccount> acc, Screen scr, int amount, char type, int creditAmount){
        int accountNumber=acc.get(acc.size()-1).getAccountNumber();
        accountNumber+=1;
        IAccount account=null;
        if (type=='N'){
            account=new NormalAccount(accountNumber,amount);
            scr.displayMessage("계좌 번호: "+accountNumber+"  금액: "+amount+" 인 Normal 계좌가 생성되었습니다");
        }else if(type=='M'){
            account=new MinusAccount(accountNumber,amount,creditAmount);
            scr.displayMessage("계좌 번호: "+accountNumber+"  금액: "+amount+" 한도 금액: "+creditAmount+"인 Minus 계좌가 생성되었습니다");
        }
        return account;
    }
}
