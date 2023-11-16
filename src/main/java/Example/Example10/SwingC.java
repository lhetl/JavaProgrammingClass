package Example.Example10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingC implements ActionListener {
    JFrame converterFrame;
    JPanel converterPanel;

    JTextField tempCelsius;
    JLabel celsiusLabel;
    JLabel fahrenheitLabel;
    JButton convertTemp;
    public SwingC() {
        converterFrame = new JFrame("Convert Celsius to Fahrenheit");
        converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converterFrame.setSize(new Dimension(120, 40));
        converterFrame.setLocationRelativeTo(null);
        converterPanel = new JPanel(new GridLayout(2, 2));
        addWidgets();
        converterFrame.getRootPane().setDefaultButton(convertTemp);
        converterFrame.getContentPane().add(converterPanel, BorderLayout.CENTER);

        converterFrame.pack();
        converterFrame.setVisible(true);
    }
    private void addWidgets() {
        tempCelsius = new JTextField(2);
        celsiusLabel = new JLabel("Celsius", SwingConstants.CENTER);
        convertTemp = new JButton("Convert");
        fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.CENTER);


        convertTemp.addActionListener(this);
        //try: tempCelsius.addActionListener(this);

        converterPanel.add(tempCelsius);
        converterPanel.add(celsiusLabel);
        converterPanel.add(convertTemp);
        converterPanel.add(fahrenheitLabel);

        celsiusLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        fahrenheitLabel.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void actionPerformed(ActionEvent event) {
        int tempFahr = (int)((Double.parseDouble(tempCelsius.getText()))*1.8 + 32);
        fahrenheitLabel.setText(tempFahr + " Fahrenheit");
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingC converter = new SwingC();
    }
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
