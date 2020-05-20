package li.jesse.namebookaccount.service;

import li.jesse.namebookaccount.pojo.Person;

public interface PersonService {

    Person getPersonByPersonId(String personId);

//    Person getPersonByPersonId(String personId, String languageCode);

}
