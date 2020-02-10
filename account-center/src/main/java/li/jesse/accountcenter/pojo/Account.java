package li.jesse.accountcenter.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
public class Account {

    private String accountId;

    private String password;

    private String givenName;

    private String middleName;

    private String surname;

    private String intlTelCode;

    private String primaryMobile;

    private String primaryEmail;

    private String description;

    private Date createTime;

    private Date updateTime;
}
