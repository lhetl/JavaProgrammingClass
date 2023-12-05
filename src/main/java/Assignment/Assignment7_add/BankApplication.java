package Assignment.Assignment7_add;

import Assignment.Assignment7_add.Entity.GUI.MainGUI;

import javax.swing.*;

public class BankApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainGUI();
            }
        });
    }
}
