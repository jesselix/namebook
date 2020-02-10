package li.jesse.accountcenter.service.impl;

import li.jesse.accountcenter.dao.AccountDao;
import li.jesse.accountcenter.pojo.Account;
import li.jesse.accountcenter.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void getAccountByAccountId(String accountId) {
        Account account = accountDao.selectByAccountId(accountId);
    }
}
