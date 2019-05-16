package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Account;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class AccountTableModel extends DefaultTableModel {

    private static String[] cols = { "ID", "Type", "Currency", "Balance" };

    private List<Account> accList = new ArrayList<>();

    public AccountTableModel() {
        super(cols, 2);
    }

}
