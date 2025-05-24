package modelObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Getter
public class CustomerAccountModel {
    private String accountId;
    private String currency;
    private List<CustomerTransactionModel> transactions;
    private int balance;

}
