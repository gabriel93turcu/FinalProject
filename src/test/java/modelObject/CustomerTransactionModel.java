package modelObject;

import lombok.Getter;

@Getter
public class CustomerTransactionModel {
    private String type;
    private String amount;
    private String message;
    private String validateType;

}
