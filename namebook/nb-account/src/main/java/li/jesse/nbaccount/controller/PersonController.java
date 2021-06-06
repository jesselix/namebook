//package li.jesse.nbaccount.controller;
//
//import li.jesse.nbaccount.pojo.Person;
//import li.jesse.nbaccount.service.PersonService;
//import li.jesse.nbcommon.constant.Constant;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import javax.servlet.http.HttpSession;
//
//@Controller
//@RequestMapping("/person/")
//public class PersonController {
//
//    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
//
//    @Autowired
//    private PersonService personService;
//
//    @GetMapping(value = "get_person")
//    @ResponseBody
//    public Person getPerson(HttpSession session) {
////        Person currentAccount = (Person)session.getAttribute("currentAccount");
////
////        if (currentAccount == null) {
////
////        }
//        String s = Constant.CURRENT_ACCOUNT;
//        logger.info("ddd");
//        Person p = new Person();
//        p = personService.getPersonByPersonId(1L);
//        logger.info(p.getLoginEmail());
//        return personService.getPersonByPersonId(1L);
////        return personService.getPersonByPersonId(currentAccount.getPersonId());
//
////        return personService.getPersonByPersonId(currentAccount.getPersonId(), "");
//    }
//
////    @GetMapping(value = "get_person")
////    @ResponseBody
////    public Person getPerson() {
////
////        Person p = new Person();
////        p = personService.getPersonByPersonId(1L);
////
////        return personService.getPersonByPersonId(1L);
////    }
//
//    @PostMapping(value = "register")
//    @ResponseBody
//    public void register() {
//
//    }
//}
