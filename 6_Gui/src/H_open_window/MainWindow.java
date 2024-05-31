package H_open_window;

import javax.swing.*;

public class MainWindow {
    JFrame frame = new JFrame();
    JButton btn = new JButton("Open new window");

    MainWindow() {
        btn.setBounds(100, 100, 200, 50);
        btn.setFocusable(false);
        btn.addActionListener(e -> {
            frame.dispose();
            new SecondWindow();
        });

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(btn);
        frame.setVisible(true);
    }
}
