package li.jesse.namebookaccount.pojo;

import java.util.Date;

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

    public Person(String personId, String password, String gender, Date dateOfBirth, String intlTelCode, String primaryMobile, String primaryEmail, Date createTime, Date updateTime) {
        this.personId = personId;
        this.password = password;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.intlTelCode = intlTelCode;
        this.primaryMobile = primaryMobile;
        this.primaryEmail = primaryEmail;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIntlTelCode() {
        return intlTelCode;
    }

    public void setIntlTelCode(String intlTelCode) {
        this.intlTelCode = intlTelCode;
    }

    public String getPrimaryMobile() {
        return primaryMobile;
    }

    public void setPrimaryMobile(String primaryMobile) {
        this.primaryMobile = primaryMobile;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
