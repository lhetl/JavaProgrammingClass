package Assignment.Assignment7_add.Dto.Request;

import Assignment.Assignment7_add.Entity.IAccount;
import Assignment.Assignment7_add.Entity.MinusAccount;
import Assignment.Assignment7_add.Entity.NormalAccount;


public record OpenRequestDto(
        char type,
        int amount,
        int creditAmount) {
    public IAccount toEntity(int lastNumber){
        char upperChar=Character.toUpperCase(this.type);
        IAccount accountTmp;
        if (upperChar=='M'){
            accountTmp=new MinusAccount(lastNumber,this.amount,this.creditAmount);
        } else if (upperChar == 'N') {
            accountTmp=new NormalAccount(lastNumber,this.amount);
        } else{
            accountTmp=new NormalAccount(lastNumber,this.amount);
        }
        return accountTmp;
    }
}
