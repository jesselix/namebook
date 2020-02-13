package li.jesse.namebookaccount.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Account {

    private String accountId;

    private String password;

    private String givenName;

    private String middleName;

    private String surname;

    private String gender;

    private Date dateOfBirth;

    private String intlTelCode;

    private String primaryMobile;

    private String primaryEmail;

    private String description;

    private Date createTime;

    private Date updateTime;
}
