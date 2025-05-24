package modelObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Getter
public class CustomerModel {
    private String fullName;
    private List<CustomerAccountModel> accounts;

    public CustomerModel(String jsonFilePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readerForUpdating(this).readValue(new File(jsonFilePath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load JSON file: " + jsonFilePath, e);
        }
    }
}
