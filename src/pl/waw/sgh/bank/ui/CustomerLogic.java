package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Bank;
import pl.waw.sgh.bank.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerLogic extends CustomerUI {

    private Bank bank = new Bank("My BANK");

    private JFrame mainWindow;

    public CustomerLogic(JFrame mainWindow) {
        super();
        this.mainWindow = mainWindow;
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer cust = bank.newCustomer(textFieldFirstName.getText(),
                        textFieldLastName.getText(),
                        textFieldEmail.getText());
                textFieldID.setText(cust.getCustomerID().toString());
                JOptionPane.showMessageDialog(mainWindow, bank);
            }
        });
    }

}
