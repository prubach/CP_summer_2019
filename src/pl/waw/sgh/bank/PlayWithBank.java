package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) throws NotEnoughMoneyException {
        //try {
            Bank bank = new Bank("MyBank");
            //bank = null;
            Customer c1 = bank.newCustomer("John", "Smith", "john@smith.com");
            Customer c2 = bank.newCustomer("Anne", "Brown", "anne@brown.com");

            Account a1 = bank.newCheckingAccount(c1, "EUR");
            Account a2 = bank.newSavingsAccount(c1, "EUR");

            Account a3 = bank.newCheckingAccount(c2, "EUR");

            a2.deposit(450.8);
            a2.charge(500.0);

            a3.deposit(222.0);

            System.out.println(bank);

            //bank.transfer(a2, a1, 50.0);

            bank.transfer(1002, 1000, 80.0);

            System.out.println(bank);

            BigDecimal b = new BigDecimal(1330);
            BigDecimal c = BigDecimal.valueOf(456.5);
            b = b.add(c);
            System.out.println(b);
        /*} catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }*/
    }
}
