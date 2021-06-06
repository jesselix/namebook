package li.jesse.nbaccount.dao;

import li.jesse.nbaccount.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonDao {

    Person selectByPersonId(Long personId);

//    Person selectByPersonId(String personId, String languageCode);

    int insertPerson(Person person);
}
