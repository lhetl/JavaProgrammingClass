package Example.Example10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing8 implements ActionListener {

    private static String labelPrefix = "Number of Clicks: ";
    private int numClicks = 0;
    final JLabel	label = new JLabel(labelPrefix + "0    ");

    public void actionPerformed(ActionEvent e) {
        numClicks++;
        label.setText(labelPrefix + numClicks);
    }

    public Component createComponents() {
        JButton button = new JButton("Swing button!");
        button.setMnemonic(KeyEvent.VK_I); // set keyboard mnemonic: ALT-i key
        button.addActionListener(this);

        JPanel pane = new JPanel(new GridLayout(0, 1));
        pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30)); //panel border
        // createEmptyBorder(top, left, bottom, right) (note) line width in pixels
        pane.add(button);
        pane.add(label);
        return pane;
    }

    private static void createAndShowGUI( ) {
        System.out.println("Current LAF: " + UIManager.getLookAndFeel());
        JFrame.setDefaultLookAndFeelDecorated(true); // set window decoration
        JFrame frame = new JFrame("Swing8 Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Swing8 app = new Swing8(); //event listener
        Component contents = app.createComponents();

        frame.add(contents, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
