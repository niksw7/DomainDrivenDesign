package com.thoughtworks.ddd.customer.repository;

import com.thoughtworks.ddd.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nikeshs on 17/06/16.
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer,String> {
}
