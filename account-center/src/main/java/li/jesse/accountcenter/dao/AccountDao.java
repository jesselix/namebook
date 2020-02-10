package li.jesse.accountcenter.dao;

import li.jesse.accountcenter.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao {

    Account selectByAccountId(String accountId);
}
