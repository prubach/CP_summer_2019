package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.Bank;
import pl.waw.sgh.bank.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerLogic extends CustomerUI {

    private Bank bank = new Bank("My BANK");

    // Currently displayed customer
    private Customer curCustomer;

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
                curCustomer = cust;
                JOptionPane.showMessageDialog(mainWindow, bank);
            }
        });
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer prevCust = bank.prevCustomer(curCustomer);
                if (prevCust!=null) {
                    displayCustomer(prevCust);
                } else {
                    //prevButton.setEnabled(false);
                }
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer nextCust = bank.nextCustomer(curCustomer);
                if (nextCust!=null) {
                    displayCustomer(nextCust);
                } else {
                    //prevButton.setEnabled(false);
                }
            }
        });


    }

    private void displayCustomer(Customer c) {
        curCustomer = c;
        textFieldID.setText(c.getCustomerID().toString());
        textFieldEmail.setText(c.getEmail());
        textFieldFirstName.setText(c.getFirstName());
        textFieldLastName.setText(c.getLastName());
    }

}
