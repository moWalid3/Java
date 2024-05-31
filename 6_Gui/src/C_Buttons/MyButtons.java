package C_Buttons;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import java.awt.Color;

public class MyButtons extends JFrame {
    JButton btn;
    JLabel label;
    ImageIcon icon;
    public MyButtons() {
        icon = new ImageIcon("0.png");
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(130, 200, 100, 100);
        label.setVisible(false);

        btn = new JButton();
        btn.setText("Click here");// you can add an icon with this text in this button like you do in label
        btn.setBounds(100, 100, 150, 50);
        btn.setFocusable(false);// to remove this text border
        btn.setForeground(Color.red);
        btn.setBackground(Color.yellow);
        btn.setBorder(BorderFactory.createEtchedBorder());// this border show when you clicked on button
        btn.addActionListener(e -> {
            label.setVisible(true);
            btn.setEnabled(false);
        });

        this.setSize(400, 400);
        this.setTitle("Buttons");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(btn);
        this.add(label);
    }

}
