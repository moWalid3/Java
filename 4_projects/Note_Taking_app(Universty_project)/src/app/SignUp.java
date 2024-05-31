package app;

import javax.swing.*;
import java.awt.*;

public class SignUp {
    JFrame signupFrame;
    JLabel nameLabel, passLabel;
    JTextField nameF, passF;
    JButton submitBtn;

    public SignUp() {

        createLabels();

        createFields();

        createSubmitButton();

        createSignupFrame();
    }

    private void createSignupFrame() {
        signupFrame = new JFrame("Login");
        signupFrame.setLocation(400, 200);
        signupFrame.setSize(420, 300);
        signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signupFrame.setLayout(null);
        signupFrame.getContentPane().setBackground(new Color(154, 234, 223));

        signupFrame.add(nameF);
        signupFrame.add(passF);
        signupFrame.add(nameLabel);
        signupFrame.add(passLabel);
        signupFrame.add(submitBtn);

        signupFrame.setVisible(true);
    }

    private void createFields() {
        nameF = new JTextField();
        passF = new JPasswordField();
        nameF.setBounds(125, 50, 200, 25);
        passF.setBounds(125, 100, 200, 25);
    }

    private void createLabels() {
        nameLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");
        nameLabel.setBounds(50, 50, 75, 25);
        passLabel.setBounds(50, 100, 75, 25);
    }

    private void createSubmitButton() {
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(125, 150, 100, 25);
        submitBtn.setFocusable(false);
        submitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        submitBtn.addActionListener(e -> {
            User user = new User(nameF.getText(), passF.getText());

            FileManager fileManager = new FileManager();
            fileManager.addUser(user);

            JOptionPane.showMessageDialog(null, "Registration Completed.");
            signupFrame.dispose();
        });
    }
}
