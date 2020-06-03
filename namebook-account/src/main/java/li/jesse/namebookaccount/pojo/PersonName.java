package li.jesse.namebookaccount.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class PersonName {

    private String personNameId;

    private String personId;

    private String languageCode;

    private String givenName;

    private String middleName;

    private String surname;

    private Date createTime;

    private Date updateTime;
}
