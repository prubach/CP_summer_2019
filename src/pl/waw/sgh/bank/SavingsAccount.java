package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class SavingsAccount extends Account {

    public SavingsAccount(Integer accountID, String currency, Customer customer) {
        super(accountID, currency, customer);
    }
}
