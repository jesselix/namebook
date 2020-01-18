package li.jesse.accountcenter.pojo;

import lombok.Data;

@Data
public class Account {

    private String accountId;

    private String surname;

    private String givenName;

    private String middleName;

    private Integer internationalTelephoneCode;

    private String primaryMobile;

    private String primaryEmail;

    private String primaryAddress;

}
