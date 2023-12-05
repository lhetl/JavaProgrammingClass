package TestClass;

import Assignment.Assignment7.Entity.IAccount;
import Assignment.Assignment7.Entity.MinusAccount;

import java.util.ArrayList;
import java.util.List;

public class TestExtends {
    public static void main(String[] args) {
        List<IAccount> tmp=new ArrayList<>();
        MinusAccount tmp2=new MinusAccount(1,1,1);
        tmp.add(tmp2);
        MinusAccount tmp3 = (MinusAccount) tmp.get(0);
        System.out.println(tmp3.getCreditAmount());
    }
}
