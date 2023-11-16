package Example.Example10;

import javax.swing.*;

public class Swing6 {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Swing6 Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JLabel label = new JLabel("\tWithin run(): " + Thread.currentThread());
        frame.add(label);
        frame.pack(); frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("\tEnter main(): " + Thread.currentThread());

        SwingUtilities.invokeLater(
                /* 람다식 */
                () -> {
                    System.out.println("\tEnter run(): " + Thread.currentThread());
                    createAndShowGUI();
                    System.out.println("\tExit run(): " + Thread.currentThread());
                }
        );

        System.out.println("\tExit main(): " + Thread.currentThread());
    }
}