package li.jesse.namebookaccount.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Person {

    private String personId;

    private String password;

    private String gender;

    private Date dateOfBirth;

    private String intlTelCode;

    private String primaryMobile;

    private String primaryEmail;

    private Date createTime;

    private Date updateTime;
}
