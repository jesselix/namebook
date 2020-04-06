package li.jesse.namebookaccount.dao;

import li.jesse.namebookaccount.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class PersonDaoTest {

    @Autowired
    PersonDao personDao;

    @Test
    public void testInsertPerson() {
        Person person = new Person();
        person.setPersonId("test001");
        person.setPassword("123456");
        person.setIntlTelCode("86");
        person.setPrimaryMobile("13500001111");
        person.setPrimaryEmail("xiaoming.wang@21cn.com");
        person.setCreateTime(new Date());
        person.setUpdateTime(new Date());


//        System.out.println(accountDao.insertAccount(testAccount));
    }
}
