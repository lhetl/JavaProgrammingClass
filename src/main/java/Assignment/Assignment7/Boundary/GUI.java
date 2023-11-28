package Assignment.Assignment7.Boundary;

import Assignment.Assignment7.Control.*;
import Assignment.Assignment7.Entity.IAccount;
import Assignment.Assignment7.Entity.MinusAccount;
import Assignment.Assignment7.Entity.NormalAccount;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUI{
    private JFrame jframe;
    private JTextField numberTextField;
    private JTextField amountTextField;
    private JTextPane resultTextPane;
    private GUIScreen screen;
    private GUIKeyboard keyBoard;
    private List<IAccount> accountList=new ArrayList<>();
    public Integer getFieldTextInt(){
        try {
            int tmp=Integer.parseInt(this.amountTextField.getText());
            return tmp;
        }catch(Exception e){
            this.screen.displayMessage("잘못된 값이 입력되었습니다.");
            return null;
        }
    }
    public String getFieldText(){
        return this.amountTextField.getText();
    }
    public String getNumberText(){
        return this.numberTextField.getText();
    }
    public int[] getNumberTextSplit(int textLength,String splitText){
        try{
            String[] tmp=this.numberTextField.getText().split(splitText);
            if (tmp.length!=textLength){
                throw new IndexOutOfBoundsException();
            }
            int[] tmp2=new int[textLength];
            for (int i=0;i<tmp2.length;i++){
                tmp2[i]=Integer.parseInt(tmp[i]);
            }
            return tmp2;
        }catch (Exception e){
            this.screen.displayMessage("잘못된 값이 입력되었습니다.");
            return null;
        }
    }
    public Integer getNumberTextInt(){
        try {
            int tmp=Integer.parseInt(this.numberTextField.getText());
            return tmp;
        }catch(Exception e){
            this.screen.displayMessage("잘못된 값이 입력되었습니다.");
            return null;
        }

    }
    public void setText(String msg){
        this.resultTextPane.setText("결과: \n"+msg);

    }
    public GUI() {
        this.jframe = new JFrame();
        this.screen = new GUIScreen(this);
        this.keyBoard = new GUIKeyboard(this);

        IAccount acc1 = new NormalAccount(1, 10000);
        IAccount acc2 = new MinusAccount(2, 50000, 10000);

        this.accountList.add(acc1);
        this.accountList.add(acc2);

        jframe.setTitle("은행 애플리케이션");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new GridBagLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());

        JLabel amountLabel = new JLabel("금액:");
        amountTextField = new JTextField(10);
        JLabel accountNumberLabel = new JLabel("계좌 번호");
        numberTextField = new JTextField(10);

        inputPanel.add(amountLabel);
        inputPanel.add(amountTextField);
        inputPanel.add(accountNumberLabel);
        inputPanel.add(numberTextField);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 2));
        buttonPanel.setPreferredSize(new Dimension((int) jframe.getSize().getWidth(),200));
        JButton depositButton = new JButton("입금");
        JButton withdrawButton = new JButton("출금");
        JButton balanceButton = new JButton("잔액 조회");
        JButton openButton = new JButton("<html><body><center>계좌 추가<br>(금액: 금액,계좌 타입 앞글자,한도 금액))</center></body></html>");
        JButton transferButton = new JButton("<html><body><center>계좌 이체<br>(계좌 번호: 송출 계좌 번호,대상 계좌 번호 ) )</center></body></html>");
        openButton.setFont(new Font(openButton.getFont().getFontName(),openButton.getFont().getStyle(),11));
        transferButton.setFont(new Font(transferButton.getFont().getFontName(),transferButton.getFont().getStyle(),11));
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(balanceButton);
        buttonPanel.add(openButton);
        buttonPanel.add(transferButton);

        depositButton.addActionListener(e -> handleDeposit());
        withdrawButton.addActionListener(e -> handleWithdraw());
        balanceButton.addActionListener(e -> handleBalance());
        openButton.addActionListener(e -> handleOpen());
        transferButton.addActionListener(e -> handleTransfer());

        resultTextPane = new JTextPane();
        resultTextPane.setEditable(false);
        StyledDocument doc = resultTextPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        resultTextPane.setFont(new Font(resultTextPane.getFont().getFontName(),Font.BOLD,12));

        GridBagConstraints gbc = new GridBagConstraints();
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

        jframe.pack();
        jframe.setMinimumSize(new Dimension(600,500));
        jframe.setVisible(true);
    }

    private void handleDeposit() {
        try {
            Integer number = getNumberTextInt();
            if (number != null) {
                IAccount acc = getAccount(number);
                if (acc != null) {
                    new DepositControl().execute(acc, screen, keyBoard);
                } else {
                    screen.displayMessage("계좌가 존재하지 않습니다");
                }
            }
        }catch(Exception e){
            screen.displayMessage("잘못된 값이 입력되었습니다.");
        }

    }
    private void handleWithdraw() {
        try {
            Integer number = getNumberTextInt();
            if (number != null) {
                IAccount acc = getAccount(number);
                if (acc != null) {
                    new WithdrawControl().execute(acc, screen, keyBoard);
                } else {
                    screen.displayMessage("계좌가 존재하지 않습니다");
                }
            }
        }catch(Exception e){
            screen.displayMessage("잘못된 값이 입력되었습니다.");
        }
    }

    private void handleBalance() {
            Integer number = getNumberTextInt();
            if (number != null){
                IAccount acc = getAccount(number);
                if (acc!=null){
                    new InquiryControl().execute(acc, screen);
                }else{
                    screen.displayMessage("계좌가 존재하지 않습니다");
                }
            }

    }

    private void handleOpen() {
        try {
            String[] tmp = getFieldText().split(",");
            int amount = Integer.parseInt(tmp[0]);
            char type = tmp[1].toCharArray()[0];
            type = Character.toUpperCase(type);

            IAccount newAccount;
            int creditAmount = Integer.MIN_VALUE;
            if (type == 'M') {
                creditAmount = Integer.parseInt(tmp[2]);
            }
            newAccount = new GUIOpenControl().execute(accountList, screen, amount, type, creditAmount);
            accountList.add(newAccount);
        } catch (Exception e) {
            screen.displayMessage("잘못된 값이 입력되었습니다.");
        }
    }

    private void handleTransfer() {
        try {
            int[] tmp = getNumberTextSplit(2, ",");
            if (tmp != null) {
                IAccount acc1 = getAccount(tmp[0]);
                IAccount acc2 = getAccount(tmp[1]);
                new GUITransferControl().execute(acc1, acc2, screen, keyBoard);
            }
        }catch(Exception e){
            screen.displayMessage("잘못된 값이 입력되었습니다.");
        }
    }

    public IAccount getAccount(int number){
        for (IAccount accountTmp : this.accountList){
            if (accountTmp.getAccountNumber()==number){
                return accountTmp;
            }
        }
        return null;
    }
}

