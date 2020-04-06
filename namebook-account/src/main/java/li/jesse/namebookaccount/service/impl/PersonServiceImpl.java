package li.jesse.namebookaccount.service.impl;

import li.jesse.namebookaccount.dao.PersonDao;
import li.jesse.namebookaccount.pojo.Person;
import li.jesse.namebookaccount.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person getPersonByPersonId(String personId, String languageCode) {
        Person person = personDao.selectByPersonId(personId, languageCode);
        if (person == null) {

        }

        return person;
    }
}
