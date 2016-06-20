package com.thoughtworks.ddd.account.repository;

import com.thoughtworks.ddd.account.model.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nikeshs on 10/06/16.
 */

public interface AccountRepository extends CrudRepository<Account,String>{
}
