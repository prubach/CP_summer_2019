package pl.waw.sgh.bank.ui;

import javax.swing.*;

public class CustomerFrame {

    public static void main(String[] args) {
        JFrame customerFrame = new JFrame("Customer");
        CustomerLogic custLogic = new CustomerLogic(customerFrame);
        //CustomerUI customerUI = new CustomerUI();
        //customerFrame.add(customerUI.getMainPanel());
        customerFrame.add(custLogic.getMainPanel());
        customerFrame.pack();
        customerFrame.setVisible(true);
    }
}
