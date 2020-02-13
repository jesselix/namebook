package li.jesse.namebookaccountcenter.controller;

import li.jesse.namebookaccountcenter.common.constant.Constant;
import li.jesse.namebookaccountcenter.pojo.Account;
import li.jesse.namebookaccountcenter.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account/")
public class AccountController {

    private AccountService accountService;

    @GetMapping(value = "get_account_info")
    @ResponseBody
    public Account getAccountInfo(HttpSession session) {
        Account currentAccount = (Account)session.getAttribute(Constant.CURRENT_ACCOUNT);
        
        if (currentAccount == null) {

        }
        return accountService.getAccountByAccountId(currentAccount.getAccountId());
    }
}
