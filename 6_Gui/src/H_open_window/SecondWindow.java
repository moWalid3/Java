package H_open_window;

import javax.swing.*;
import java.awt.*;

public class SecondWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello in second window");

    SecondWindow() {
        label.setBounds(100, 120, 300, 50);
        label.setFont(new Font("ROBOTO", Font.ITALIC, 22));

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
    }
}
