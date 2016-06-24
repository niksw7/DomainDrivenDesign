package com.thoughtworks.ddd.account.repository;

import com.thoughtworks.ddd.account.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nikeshs on 10/06/16.
 */

@Repository
public interface AccountRepository extends MongoRepository<Account,String> {
}
