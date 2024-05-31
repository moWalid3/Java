package R_login_system;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class WelcomePage {
    JFrame frame;
    JLabel label;

    WelcomePage(String name) {
        label = new JLabel("Welcome " + name);
        label.setFont(new Font("ROBOTO", Font.ITALIC, 30));
        label.setBounds(50, 50, 300, 100);

        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
    }
}
