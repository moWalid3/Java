package R_login_system;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class LoginSystem extends JFrame {
    HashMap<String, String> loginData;
    JLabel nameLabel, passLabel, massLabel;
    JTextField nameF;
    JPasswordField passF;
    JButton loginBtn, resetBtn;

    LoginSystem() {

        labels();

        fields();

        loginButton();

        resetButton();

        myFrame();
    }

    private void myFrame() {
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(nameF);
        this.add(passF);
        this.add(nameLabel);
        this.add(passLabel);
        this.add(massLabel);
        this.add(loginBtn);
        this.add(resetBtn);
        this.setVisible(true);
    }

    private void fields() {
        nameF = new JTextField();
        passF = new JPasswordField();
        nameF.setBounds(125, 100, 200, 25);
        passF.setBounds(125, 150, 200, 25);
    }

    private void labels() {
        nameLabel = new JLabel("User name:");
        passLabel = new JLabel("Password:");
        massLabel = new JLabel();
        nameLabel.setBounds(50, 100, 75, 25);
        passLabel.setBounds(50, 150, 75, 25);
        massLabel.setBounds(125, 250, 250, 35);
        massLabel.setFont(new Font("MV Boli", Font.ITALIC, 25));
        massLabel.setForeground(Color.red);
    }

    private void loginButton() {
        loginData = new DB().getLoginData();

        loginBtn = new JButton("Login");
        loginBtn.setBounds(125, 200, 100, 25);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(e -> {
            if (loginData.containsKey(nameF.getText()) && String.valueOf(passF.getPassword()).equals(loginData.get(nameF.getText()))) {
                this.dispose();
                new WelcomePage(nameF.getText());
            } else {
                massLabel.setText("Not correct!!");
            }
        });
    }

    private void resetButton() {
        resetBtn = new JButton("Reset");
        resetBtn.setBounds(225, 200, 100, 25);
        resetBtn.setFocusable(false);
        resetBtn.addActionListener(e -> {
            nameF.setText("");
            passF.setText("");
        });
    }
}
