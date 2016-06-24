package com.thoughtworks.ddd.customer.service;

import com.thoughtworks.ddd.customer.exceptions.LowCreditScoreException;
import com.thoughtworks.ddd.customer.model.Customer;
import com.thoughtworks.ddd.customer.repository.CustomerRepository;
import com.thoughtworks.ddd.customer.vo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nikeshs on 17/06/16.
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public void createCustomer(String id, String aadhar, String firstName, String lastName, Address address, int creditScore) throws LowCreditScoreException {
        customerRepository.save(new Customer(id, aadhar,  firstName,  lastName,  address, creditScore));
    }
    public void deleteOlder(String id)
    {}
}
