package pl.waw.sgh.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Customer> customerList = new ArrayList<>();

    private List<Account> accountList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 1000;

    public Bank(String name) {
        this.name = name;
    }

    public Customer newCustomer(String firstName, String lastname, String email) {
        Customer cust = new Customer(lastCustID++, firstName, lastname, email);
        customerList.add(cust);
        return cust;
    }

    private Account newAccount(Customer customer, String currency, boolean isChecking) {
        Account acc = isChecking ?
                  new CheckingAccount(lastAccID++, currency, customer)
                : new SavingsAccount(lastAccID++, currency, customer);
        accountList.add(acc);
        return acc;
    }

    public Account newCheckingAccount(Customer customer, String currency) {
        return newAccount(customer, currency, true);
    }

    public Account newSavingsAccount(Customer customer, String currency) {
        return newAccount(customer, currency, false);
    }


    @Override
    public String toString() {
        return "Bank{" +
                "'" + name + '\'' +
                "\ncusts=" + customerList +
                "\naccs=" + accountList +
                '}';
    }
}
