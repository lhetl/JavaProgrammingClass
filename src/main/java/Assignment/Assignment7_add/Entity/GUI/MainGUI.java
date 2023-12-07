package Assignment.Assignment7_add.Entity.GUI;

import Assignment.Assignment7_add.Exception.NotIntegerException;
import Assignment.Assignment7_add.Exception.ValueErrorException;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class MainGUI {
    private JFrame jframe;
    private JTextField numberTextField;
    private JTextField amountTextField;
    private JTextPane resultTextPane;
    private JButton depositButton = new JButton();
    private JButton withdrawButton = new JButton();
    private JButton balanceButton = new JButton();
    private JButton openButton = new JButton();
    private JButton transferButton = new JButton();
    private boolean displayCheck=false;
    public String getAmountField(){
        return this.amountTextField.getText();
    }
    public Integer getAmountText(){ // 가격 텍스트 필드 int 값 체크 + 가져오기
        try {
            return Integer.parseInt(this.amountTextField.getText());
        }catch(Exception e){
            throw new NotIntegerException();
        }
    }
    public int[] getAccountNumberSplit(int textLength,String splitText){ //계좌 번호 텍스트 필드 끊어서 가져오기
        try{
            String[] tmp=this.numberTextField.getText().split(splitText);
            if (tmp.length!=textLength){
                throw new ValueErrorException();
            }
            int[] tmp2=new int[textLength];
            for (int i=0;i<tmp2.length;i++){
                tmp2[i]=Integer.parseInt(tmp[i]);
            }
            return tmp2;
        }catch (Exception e){
            throw new NotIntegerException();
        }
    }
    public Integer getAccountNumberInt(){
        try {
            return Integer.parseInt(this.numberTextField.getText());
        }catch(Exception e){
            throw new NotIntegerException();
        }
    }
    public void setText(String msg){ //결과 텍스트 값 설정
        this.resultTextPane.setText("결과: \n"+msg);
    }

    public JButton getDepositButton() {
        return depositButton;
    }

    public JButton getWithdrawButton() {
        return withdrawButton;
    }

    public JButton getBalanceButton() {
        return balanceButton;
    }

    public JButton getOpenButton() {
        return openButton;
    }

    public JButton getTransferButton() {
        return transferButton;
    }

    public boolean isDisplayCheck() {
        return displayCheck;
    }

    public MainGUI() {
        this.jframe = new JFrame();

        jframe.setTitle("은행 애플리케이션"); //frame 기본 설정
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new GridBagLayout());

        JPanel inputPanel = new JPanel(new FlowLayout()); // 필드 패널 설정

        JLabel amountLabel = new JLabel("금액:");
        amountTextField = new JTextField(10);
        JLabel accountNumberLabel = new JLabel("계좌 번호");
        numberTextField = new JTextField(10);

        inputPanel.add(amountLabel);
        inputPanel.add(amountTextField);
        inputPanel.add(accountNumberLabel);
        inputPanel.add(numberTextField);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 2));   //버튼 패널 설정
        buttonPanel.setPreferredSize(new Dimension((int) jframe.getSize().getWidth(),200));
        depositButton.setText("입금");
        withdrawButton.setText("출금");
        balanceButton.setText("잔액 조회");
        openButton.setText("<html><body><center>계좌 추가<br>(금액: 금액,계좌 타입 앞글자,한도 금액))</center></body></html>");
        transferButton.setText("<html><body><center>계좌 이체<br>(계좌 번호: 송출 계좌 번호,대상 계좌 번호 ) )</center></body></html>");
        openButton.setFont(new Font(openButton.getFont().getFontName(),openButton.getFont().getStyle(),11));
        transferButton.setFont(new Font(transferButton.getFont().getFontName(),transferButton.getFont().getStyle(),11));
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(balanceButton);
        buttonPanel.add(openButton);
        buttonPanel.add(transferButton);

        resultTextPane = new JTextPane();  //결과 박스 설정
        resultTextPane.setEditable(false);
        StyledDocument doc = resultTextPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        resultTextPane.setFont(new Font(resultTextPane.getFont().getFontName(),Font.BOLD,12));

        GridBagConstraints gbc = new GridBagConstraints(); // 각 프레임 메인 프레임에 추가(gridbag 사용)
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridheight=1;
        gbc.gridwidth=10;
        gbc.fill=GridBagConstraints.BOTH;
        jframe.add(inputPanel,gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridheight=15;
        gbc.gridwidth=10;
        gbc.fill=GridBagConstraints.BOTH;
        jframe.add(buttonPanel,gbc);
        gbc.gridx=0;
        gbc.gridy=16;
        gbc.gridheight=4;
        gbc.gridwidth=10;
        gbc.fill=GridBagConstraints.BOTH;
        jframe.add(resultTextPane, gbc);

        jframe.pack();  //프레임 보여주기 설정
        jframe.setMinimumSize(new Dimension(600, 500));
    }
    public void display(){
        if (!this.displayCheck) {
            jframe.setVisible(true);
            this.displayCheck=true;
        }else{
            jframe.setVisible(false);
            this.displayCheck=false;
        }
    }

}

