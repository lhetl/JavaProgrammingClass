package Assignment.Assignment7_add.Entity.GUI;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class ErrorGUI {
    private JFrame jFrame;
    private JTextPane errorMessageLabel;
    public ErrorGUI() {
        this.jFrame=new JFrame();
        errorMessageLabel = new JTextPane();
        errorMessageLabel.setEditable(false);
        StyledDocument doc = errorMessageLabel.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        errorMessageLabel.setFont(new Font(errorMessageLabel.getFont().getFontName(),Font.BOLD,12));

        jFrame.add(errorMessageLabel);
        jFrame.setTitle("에러 발생");
        jFrame.setSize(300, 100);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void setErrorMessage(String errorMessage) {
        errorMessageLabel.setText(errorMessage);
    }
    public void display(){
        jFrame.setVisible(true);
    }
}
