package com.thoughtworkd.ddd.workflowmanager;

import com.thoughtworks.ddd.account.customer.service.CustomerService;
import com.thoughtworks.ddd.account.customer.vo.Address;
import com.thoughtworks.ddd.account.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by nikeshs on 10/06/16.
 */
@Component
public class ConsoleRunner implements CommandLineRunner {
    @Autowired
    private AccountService accountService;
    @Autowired
    private CustomerService customerService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello i am command runner");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        while(true) {
            switch (input) {
                case "1":
                    String accountId = IdGenerator.accountId();
                    accountService.createAccount(accountId, bufferedReader.readLine());
                    System.out.println("Account created with accountId: "+accountId);
                    break;
                case "2":
                    String customerId = IdGenerator.customerId();
                    customerService.createCustomer(
                            customerId,
                            bufferedReader.readLine(),
                            bufferedReader.readLine(),
                            bufferedReader.readLine(),
                            new Address(),
                            Integer.parseInt(bufferedReader.readLine()));
                    System.out.println("Customer created with customerId "+customerId);
                    break;
                case "3":
                    maintainanceTask();

                    break;
                case "5":
                    return;
            }
        }

    }

    private boolean maintainanceTask() {
        //customerService.
        return false;

    }


}
