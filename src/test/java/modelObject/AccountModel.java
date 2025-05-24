package modelObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Getter
@Setter
public class AccountModel {
    private String accountId;
    private String currency;
}