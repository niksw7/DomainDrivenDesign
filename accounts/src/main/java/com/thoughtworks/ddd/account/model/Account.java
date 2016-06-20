package com.thoughtworks.ddd.account.model;

import java.util.List;

/**
 * Created by nikeshs on 10/06/16.
 */
public class Account {

    private String id;
    private String customerId;
    private String accountNumber;
    private List<String> transferAccounts;

    public Account(String id, String customerId) {
        this.id = id;
        this.customerId = customerId;
    }

    public List<String> getTransferAccounts() {
        return transferAccounts;
    }

    public String getId() {
        return id;
    }
}
