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
                curCustomer.setFirstName(textFieldFirstName.getText());
                curCustomer.setLastName(textFieldLastName.getText());
                curCustomer.setEmail(textFieldEmail.getText());
            }
        });
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer prevCust = bank.prevCustomer(curCustomer);
                if (prevCust!=null) {
                    displayCustomer(prevCust);
                } else {
                    prevButton.setEnabled(false);
                    nextButton.setEnabled(true);
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
                    nextButton.setEnabled(false);
                    prevButton.setEnabled(true);
                }
            }
        });
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer cust = bank.newCustomer("",
                        "",
                        "");
                textFieldID.setText(cust.getCustomerID().toString());
                displayCustomer(cust);
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
