package modelObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Getter
public class BankManagerModel {

    private String firstName;
    private String lastName;
    private String postCode;
    private String customerId;
    private List<AccountModel> accounts;


    public BankManagerModel(String jsonFilePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readerForUpdating(this).readValue(new File(jsonFilePath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load JSON file: " + jsonFilePath, e);
        }
    }
}


