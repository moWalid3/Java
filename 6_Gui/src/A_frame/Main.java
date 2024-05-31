package A_frame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = getjLabel();

        frame.setSize(400,400);
//        frame.setResizable(false);// to not resize frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close run when exit frame
        frame.setTitle("this is a title");
        frame.getContentPane().setBackground(new Color(231, 168, 42));
        frame.setVisible(true); // this visible must be at the end of code

        frame.add(label);

        frame.setLayout(null);
//        frame.pack();// be label take all frames (without)=> frame.setLayout(null), label.setBounds()

    }

    private static JLabel getjLabel() {
        JLabel label = new JLabel();
        ImageIcon imageIcon = new ImageIcon("0.png");
        Border border = BorderFactory.createLineBorder(Color.blue,4);

        label.setText("welcome to my label");
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER);// LEFT, RIGHT
        label.setVerticalTextPosition(JLabel.BOTTOM);// TOP, CENTER(default)
        label.setForeground(Color.red);// color for text
        label.setFont(new Font("Georgia",Font.ITALIC,20));// (name, style, size)
        label.setIconTextGap(30);// gap between text and Icon
        label.setVerticalAlignment(JLabel.TOP);// vertical position for label (text + icon)
        label.setHorizontalAlignment(0);// horizontal position for label
        label.setBackground(Color.green);
        label.setOpaque(true);// because setBackground() work

        label.setBounds(10,10,250,250);// place as a frame
        label.setBorder(border);

        return label;
    }
}