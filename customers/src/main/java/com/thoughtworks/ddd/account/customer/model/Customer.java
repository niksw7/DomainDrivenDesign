package com.thoughtworks.ddd.account.customer.model;

import com.thoughtworks.ddd.account.customer.exceptions.LowCreditScoreException;
import com.thoughtworks.ddd.account.customer.vo.Address;

/**
 * Created by nikeshs on 10/06/16.
 */
public class Customer {
    private String id;
    private String aadhar;
    private String firstName,lastName;
    private Address address;
    private int creditScore;

    public Customer(String id, String aadhar, String firstName, String lastName, Address address, int creditScore) throws LowCreditScoreException {
        this.id = id;
        this.aadhar = aadhar;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.creditScore = creditScore;
     if(creditScore<100){
         throw new LowCreditScoreException();
     }
    }

}
