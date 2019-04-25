package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class CheckingAccount extends Account {

    public CheckingAccount(Integer accountID, BigDecimal balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }
}
