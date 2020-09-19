package li.jesse.namebookaccount.dao;

import li.jesse.namebookaccount.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonDao {

    Person selectByPersonId(Long personId);

//    Person selectByPersonId(String personId, String languageCode);

    int insertPerson(Person person);
}
