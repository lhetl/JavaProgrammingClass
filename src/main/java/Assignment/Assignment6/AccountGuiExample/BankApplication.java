package Assignment.Assignment6.AccountGuiExample;

import Assignment.Assignment6.AccountGuiExample.Boundary.GUI;

import javax.swing.*;

public class BankApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI();
            }
        });
    }
}
