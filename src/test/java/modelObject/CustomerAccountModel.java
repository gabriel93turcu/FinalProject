package modelObject;

import lombok.Getter;

import java.util.List;

@Getter
public class CustomerAccountModel {
    private String accountId;
    private String currency;
    private List<CustomerTransactionModel> transactions;
    private int balance;

}
