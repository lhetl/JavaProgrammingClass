package Assignment.Assignment7_add.Repository;
import Assignment.Assignment7_add.Entity.*;

import java.util.List;

public class AccountRepository {
    private List<IAccount> accountList;
    public AccountRepository(){
        IAccount acc1 = new NormalAccount(1, 10000); //계좌 기본값
        IAccount acc2 = new MinusAccount(2, 50000, 10000);
        this.accountList.add(acc1);
        this.accountList.add(acc2);

    }
    public IAccount findById(int number) {
        IAccount account = null;
        for (IAccount accountTmp : this.accountList) {
            if (accountTmp.getAccountNumber() == number) {
                account = accountTmp;
            }
        }
        if (account == null) {
            throw new RuntimeException();  //TODO
        } else {
            return account;
        }
    }
    public void saveAccount(IAccount account){
        this.accountList.add(account);
    }
    public int getLastNumber(){
        return this.accountList.get(accountList.size()-1).getAccountNumber();
    }

    public List<IAccount> getAccountList() {
        return accountList;
    }
}
