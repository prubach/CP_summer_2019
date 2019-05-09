package pl.waw.sgh.bank;

public class NonExistingAccountException extends BankException {

    public NonExistingAccountException(String msg) {
        super(msg);
    }
}
