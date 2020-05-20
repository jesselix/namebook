package li.jesse.namebookaccount.controller;

import li.jesse.namebookaccount.pojo.Person;
import li.jesse.namebookaccount.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/person/")
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @GetMapping(value = "get_person")
    @ResponseBody
    public Person getPerson(HttpSession session) {
        Person currentAccount = (Person)session.getAttribute("currentAccount");

        if (currentAccount == null) {

        }

        logger.info("ddd");

        return personService.getPersonByPersonId("person_id_0001");

//        return personService.getPersonByPersonId(currentAccount.getPersonId());

//        return personService.getPersonByPersonId(currentAccount.getPersonId(), "");
    }

    @PostMapping(value = "register")
    @ResponseBody
    public void register() {

    }
}
