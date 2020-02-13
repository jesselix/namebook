package li.jesse.namebookaccount.service.impl;

import li.jesse.namebookaccount.dao.AccountDao;
import li.jesse.namebookaccount.pojo.Account;
import li.jesse.namebookaccount.service.AccountService;
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
