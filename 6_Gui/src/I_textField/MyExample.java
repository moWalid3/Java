package I_textField;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class MyExample {
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");

    MyExample() {
        textField.setBackground(Color.gray);
        textField.setPreferredSize(new Dimension(400,50));
        textField.setForeground(Color.yellow);
        textField.setCaretColor(Color.red);
        textField.setFont(new Font(null, Font.PLAIN, 30));

        button.setFocusable(false);
        button.addActionListener(e -> {
            System.out.println(textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
    }
}
