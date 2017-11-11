package com.aniu.msg.dal.dao;

import com.aniu.msg.dal.object.AccountDO;

import java.util.List;

public interface AccountDAO {
    AccountDO selectById(long id);

    void insert(AccountDO accountDO);

    void batchInsert(List<AccountDO> accountDO);

    void delete(long id);

    void update(AccountDO accountDO);
}
