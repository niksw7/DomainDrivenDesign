package com.thoughtworks.ddd.account.customer.repository;

import com.thoughtworks.ddd.account.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nikeshs on 17/06/16.
 */
public interface CustomerRepository extends CrudRepository<Customer,String>{
}
