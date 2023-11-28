package Assignment.Assignment7;

import Assignment.Assignment7.Boundary.GUI;

import javax.swing.*;

public class BankApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}
