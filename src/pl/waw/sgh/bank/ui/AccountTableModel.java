package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Account;

import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountTableModel extends DefaultTableModel {

    private static String[] cols = { "ID", "Type", "Currency", "Balance" };

    private List<Account> accList = new ArrayList<>();

    public AccountTableModel() {
        super(cols, 2);
    }



    @Override
    public Class<?> getColumnClass(int col) {
        switch (col) {
            case 0:
                return Integer.class;
            case 3:
                return BigDecimal.class;
            default:
                return String.class;
        }
    }
}
