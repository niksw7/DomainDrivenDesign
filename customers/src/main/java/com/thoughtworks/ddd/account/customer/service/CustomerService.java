package com.thoughtworks.ddd.account.customer.service;

import com.thoughtworks.ddd.account.customer.exceptions.LowCreditScoreException;
import com.thoughtworks.ddd.account.customer.model.Customer;
import com.thoughtworks.ddd.account.customer.repository.CustomerRepository;
import com.thoughtworks.ddd.account.customer.vo.Address;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nikeshs on 17/06/16.
 */
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public void createCustomer(String id, String aadhar, String firstName, String lastName, Address address, int creditScore) throws LowCreditScoreException {
        customerRepository.save(new Customer(id, aadhar,  firstName,  lastName,  address, creditScore));
    }
    public void deleteOlder(String id)
    {}
}
