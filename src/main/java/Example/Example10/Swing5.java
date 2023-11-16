package Example.Example10;

import javax.swing.*;

public class Swing5 {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Swing5 Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JLabel label = new JLabel("\tWithin run(): " + Thread.currentThread());
        frame.add(label);
        frame.pack(); frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("\tEnter main(): " + Thread.currentThread());

        SwingUtilities.invokeLater(
                new Runnable() { //무명 클래스
                    public void run() {
                        System.out.println("\tEnter run(): " + Thread.currentThread());
                        createAndShowGUI();
                        System.out.println("\tExit run(): " + Thread.currentThread());
                    }
                }
        );

        System.out.println("\tExit main(): " + Thread.currentThread());
    }
}

