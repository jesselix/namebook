package li.jesse.namebookaccount.dao;

import li.jesse.namebookaccount.pojo.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountDaoTest {

    @Autowired
    AccountDao accountDao;

    @Test
    public void testInsertAccount() {
        Account testAccount = new Account();
        testAccount.setAccountId("test001");
        testAccount.setPassword("123456");
        testAccount.setGivenName("Xiaoming");
        testAccount.setSurname("Wang");
        testAccount.setIntlTelCode("86");
        testAccount.setPrimaryMobile("13500001111");
        testAccount.setPrimaryEmail("xiaoming.wang@21cn.com");
        testAccount.setDescription("hi, buddy, my name is Xiaoming");

        System.out.println(accountDao.insertAccount(testAccount));
    }
}
