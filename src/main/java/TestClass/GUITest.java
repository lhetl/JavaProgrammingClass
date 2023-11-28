package TestClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITest extends JFrame {
    private JTextField amountTextField;
    private JLabel resultLabel;

    public GUITest() {
        // 프레임 설정
        setTitle("은행 애플리케이션");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 컴포넌트 생성
        JLabel amountLabel = new JLabel("금액:");
        amountTextField = new JTextField(10);
        JButton depositButton = new JButton("입금");
        JButton withdrawButton = new JButton("출금");
        JButton balanceButton = new JButton("잔액 조회");
        resultLabel = new JLabel("결과:");

        // 이벤트 핸들러 등록
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposit();
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdraw();
            }
        });

        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBalance();
            }
        });

        // 컴포넌트를 프레임에 추가
        add(amountLabel);
        add(amountTextField);
        add(depositButton);
        add(withdrawButton);
        add(balanceButton);
        add(resultLabel);

        // 프레임 설정 및 표시
        pack();
        setLocationRelativeTo(null); // 화면 중앙에 표시
        setVisible(true);
    }

    private void deposit() {
        // 입금 로직을 여기에 구현
        String amountStr = amountTextField.getText();
        // 입금 로직 추가 (예: resultLabel.setText("입금 성공!");)
    }

    private void withdraw() {
        // 출금 로직을 여기에 구현
        String amountStr = amountTextField.getText();
        // 출금 로직 추가 (예: resultLabel.setText("출금 성공!");)
    }

    private void checkBalance() {
        // 잔액 조회 로직을 여기에 구현
        // 잔액 조회 로직 추가 (예: resultLabel.setText("잔액: 100,000원");)
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUITest();
            }
        });
    }
}