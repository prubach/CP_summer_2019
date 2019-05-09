package pl.waw.sgh.bank.ui;

import javax.swing.*;
import java.awt.*;

public class FirstWindow {

    public static void main(String[] args) {
        JFrame frame = new JFrame("First Window");
        frame.setSize(800, 500);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        LayoutManager layoutManager = new FlowLayout();
        frame.setLayout(layoutManager);
        JPanel mainPanel = new JPanel();
        mainPanel.add(new JLabel("Hello, what's your name:"));
        JTextField nameField = new JTextField(50);
        mainPanel.add(nameField);
        JButton okButton = new JButton("OK");
        mainPanel.add(okButton);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
