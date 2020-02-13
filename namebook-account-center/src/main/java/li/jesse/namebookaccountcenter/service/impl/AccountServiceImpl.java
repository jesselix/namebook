package li.jesse.namebookaccountcenter.service.impl;

import li.jesse.namebookaccountcenter.dao.AccountDao;
import li.jesse.namebookaccountcenter.pojo.Account;
import li.jesse.namebookaccountcenter.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account getAccountByAccountId(String accountId) {
        Account account = accountDao.selectByAccountId(accountId);
        if (account == null) {

        }

        return account;
    }
}
