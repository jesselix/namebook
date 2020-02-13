package li.jesse.namebookaccountcenter.dao;

import li.jesse.namebookaccountcenter.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao {

    Account selectByAccountId(String accountId);
}
