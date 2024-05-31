package app;

import javax.swing.*;
import java.awt.*;

public class Login {
    JFrame loginFrame;
    JLabel nameLabel, passLabel, massLabel;
    JTextField nameF, passF;
    JButton loginBtn, signupBtn;

    public Login() {

        createLabels();

        createFields();

        createLoginButton();

        createSignupButton();

        createLoginFrame();
    }

    private void createLoginFrame() {
        loginFrame = new JFrame("Login");
        loginFrame.setLocation(500, 200);
        loginFrame.setSize(420, 420);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);
        loginFrame.getContentPane().setBackground(new Color(181, 241, 195));

        loginFrame.add(nameF);
        loginFrame.add(passF);
        loginFrame.add(nameLabel);
        loginFrame.add(passLabel);
        loginFrame.add(massLabel);
        loginFrame.add(loginBtn);
        loginFrame.add(signupBtn);

        loginFrame.setVisible(true);
    }

    private void createFields() {
        nameF = new JTextField();
        passF = new JPasswordField();
        nameF.setBounds(125, 100, 200, 25);
        passF.setBounds(125, 150, 200, 25);
    }

    private void createLabels() {
        nameLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");
        massLabel = new JLabel();
        nameLabel.setBounds(50, 100, 75, 25);
        passLabel.setBounds(50, 150, 75, 25);
        massLabel.setBounds(110, 250, 250, 35);
        massLabel.setFont(new Font(null, Font.PLAIN, 20));
        massLabel.setForeground(Color.red);
    }

    private void createLoginButton() {
        loginBtn = new JButton("Log in");
        loginBtn.setBounds(125, 200, 100, 25);
        loginBtn.setFocusable(false);
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        loginBtn.addActionListener(e -> {
            String name = nameF.getText();
            String pass = passF.getText();
            FileManager fileManager = new FileManager();

            if (fileManager.isUserExist(new User(name, pass))) {
                loginFrame.dispose();
                new WelcomePage(name);
            } else {
                massLabel.setText("Invalid name or password!");
            }
        });
    }

    private void createSignupButton() {
        signupBtn = new JButton("Sign up");
        signupBtn.setBounds(225, 200, 100, 25);
        signupBtn.setFocusable(false);
        signupBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signupBtn.addActionListener(e -> new SignUp());
    }
}
