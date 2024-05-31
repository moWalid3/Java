package L_CheckBox;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox("Are you agree?");
        checkBox.setFocusable(false);
        checkBox.setForeground(Color.magenta);
        checkBox.setBackground(Color.darkGray);

        JButton button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(e -> {
            System.out.println(checkBox.isSelected());
        });

        frame.add(button);
        frame.add(checkBox);

        frame.pack();
        frame.setVisible(true);
    }
}
