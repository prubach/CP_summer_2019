package pl.waw.sgh;

import javax.swing.*;

public class GuiInput {

    public static void main(String[] args) {

        int dec = JOptionPane.CANCEL_OPTION;
        while (dec!=JOptionPane.OK_OPTION) {
            String input =
                    JOptionPane.showInputDialog(null, "What's your name?");
            JOptionPane.showMessageDialog(null, "Hello " + input);
            dec = JOptionPane.showConfirmDialog(null, "Are you sure?");
            JOptionPane.showMessageDialog(null, "Your decision: " + dec);
        }



    }
}
