package com.thoughtworks.ddd.account.model;

/**
 * Created by nikeshs on 10/06/16.
 */
public class Account {

    private String id;
    private String customerId;

    public Account(String id, String customerId) {
        this.id = id;
        this.customerId = customerId;
    }
}
