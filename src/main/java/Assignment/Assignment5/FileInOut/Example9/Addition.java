package Assignment.Assignment5.FileInOut.Example9;

import javax.swing.JOptionPane;
public class Addition {
    public static void main( String[] args ) {
        // obtain user inputString from JOptionPane input dialogs
        String firstNumber = JOptionPane.showInputDialog( "Enter first integer" );
        String secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

        // convert String inputs to int values for use in a calculation
        int number1 = Integer.parseInt( firstNumber );
        int number2 = Integer.parseInt( secondNumber );
        int sum = number1 + number2; // add numbers

        // display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(
                null, 					// 위치 - parent window 또는 화면null인 경우의 중앙
                "The sum is " + sum,		// 출력될 메시지
                "Sum of Two Integers", 		// 대화상자의 제목
                JOptionPane.PLAIN_MESSAGE ); // 메시지 대화상자의 유형
    } // end method main
} // end class Addition

