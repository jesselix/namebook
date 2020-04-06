package li.jesse.namebookaccount.dao;

import li.jesse.namebookaccount.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonDao {

    Person selectByPersonId(String personId);

    Person selectByPersonId(String personId, String languageCode);

    int insertAccount(Person person);
}
