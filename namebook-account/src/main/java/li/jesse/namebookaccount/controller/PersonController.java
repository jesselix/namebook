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

    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @GetMapping(value = "get_account")
    @ResponseBody
    public Person getAccount(HttpSession session) {
        Person currentAccount = (Person)session.getAttribute("currentAccount");

        if (currentAccount == null) {

        }

        return personService.getPersonByPersonId(currentAccount.getPersonId(), "");
    }

    @PostMapping(value = "register")
    @ResponseBody
    public void register() {

    }
}
