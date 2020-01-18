package li.jesse.accountcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account/")
public class AccountController {

    @RequestMapping(value = "get_user_info.do",method = RequestMethod.GET)
    @ResponseBody
    public void getUserInfo(HttpSession session) {

        System.out.println("ddd");
    }
}
