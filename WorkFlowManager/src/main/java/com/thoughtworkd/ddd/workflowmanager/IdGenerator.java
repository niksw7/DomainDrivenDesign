package com.thoughtworkd.ddd.workflowmanager;

import java.util.UUID;

/**
 * Created by nikeshs on 17/06/16.
 */
public class IdGenerator {
    public static String customerId(){

        return randomNumber();
    }

    public static String accountId() {
        return randomNumber();
    }

    private static String randomNumber() {
        return UUID.randomUUID().toString();
    }
}
