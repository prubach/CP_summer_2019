package pl.waw.sgh.bank;

import java.net.Inet4Address;
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

    public Account findAccountByID(Integer accID) throws NonExistingAccountException {
        for (Account acc : accountList) {
            if (acc.getAccountID().equals(accID))
                return acc;
        }
        throw new NonExistingAccountException("Account with ID: " + accID + " not found!");
    }

    public void transfer(Integer fromAccID, Integer toAccID, double toTransfer) throws NotEnoughMoneyException, NonExistingAccountException {
    //public void transfer(Integer fromAccID, Integer toAccID, double toTransfer) throws BankException {
        transfer(findAccountByID(fromAccID), findAccountByID(toAccID), toTransfer);
    }

    public void transfer(Account fromAcc, Account toAcc, double toTransfer) throws NotEnoughMoneyException {
        fromAcc.charge(toTransfer);
        toAcc.deposit(toTransfer);
    }

    public Customer prevCustomer(Customer curCust) {
        int curCustIdx = customerList.indexOf(curCust);
        if (curCustIdx > 0) {
            return customerList.get(curCustIdx - 1);
        } else {
            //customerList.size()
            return null;
        }
    }

    public Customer nextCustomer(Customer curCust) {
        int curCustIdx = customerList.indexOf(curCust);
        if (curCustIdx < customerList.size()-1) {
            return customerList.get(curCustIdx + 1);
        } else {
            //customerList.size()
            return null;
        }
    }

    public List<Account> findAccountByCustomer(Customer cust) {
        List<Account> acList = new ArrayList<>();
        for (Account acc : accountList) {
            if (acc.getCustomer()==cust)
                acList.add(acc);
        }
        return acList;
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
