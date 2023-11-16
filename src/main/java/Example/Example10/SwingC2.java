package Example.Example10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingC2 implements ActionListener {
    JTextField tempCelsius;
    JButton convertTemp;
    JLabel fahrenheitLabel;

    public SwingC2() { // 생성자 - GUI 생성 및 실현
        JFrame converterFrame = new JFrame("Convert Celsius to Fahrenheit");
        JFrame.setDefaultLookAndFeelDecorated(true);
        converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converterFrame.setMinimumSize(new Dimension(600, 300));
        converterFrame.setLocationRelativeTo(null);

        JPanel converterPanel = new JPanel(new GridLayout(2, 2));
        addWidgets(converterPanel);
        converterFrame.getRootPane().setDefaultButton(convertTemp);
        converterFrame.add(converterPanel, BorderLayout.CENTER);

        converterFrame.pack();
        converterFrame.setVisible(true);
    }
    private void addWidgets(JPanel subcontainer) {
        tempCelsius = new JTextField();
        JLabel celsiusLabel = new JLabel("Celsius", SwingConstants.LEFT);
        convertTemp = new JButton("Convert");
        fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.CENTER);

        convertTemp.addActionListener(this); //tempCelsius.addActionListener(this);

        subcontainer.add(tempCelsius);
        subcontainer.add(celsiusLabel);
        subcontainer.add(convertTemp);
        subcontainer.add(fahrenheitLabel);

        fahrenheitLabel.setBorder(BorderFactory.createRaisedBevelBorder());
        celsiusLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    public void actionPerformed(ActionEvent event) {
        // text field의 입력(String)을 획득하여 double로 변환
        int tempFahr = (int)((Double.parseDouble(tempCelsius.getText())) * 1.8 + 32);

        fahrenheitLabel.setText(tempFahr + " Fahrenheit");
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater( () -> new SwingC2() );
    }
}

