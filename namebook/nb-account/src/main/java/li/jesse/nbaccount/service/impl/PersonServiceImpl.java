package li.jesse.nbaccount.service.impl;

import li.jesse.nbaccount.dao.PersonDao;
import li.jesse.nbaccount.pojo.Person;
import li.jesse.nbaccount.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person getPersonByPersonId(Long personId) {
        Person person = personDao.selectByPersonId(personId);

        return person;
    }

//    @Override
//    public Person getPersonByPersonId(String personId, String languageCode) {
//        Person person = personDao.selectByPersonId(personId, languageCode);
//        if (person == null) {
//
//        }
//
//        return person;
//    }
}
