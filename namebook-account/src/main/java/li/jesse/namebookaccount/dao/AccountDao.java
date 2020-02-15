package li.jesse.namebookaccount.dao;

import li.jesse.namebookaccount.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao {

    Account selectByAccountId(String accountId);

    int insertAccount(Account account);
}
