package M_JRadioButtons;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton black = new JRadioButton("Black");
        JRadioButton green = new JRadioButton("Green");
        JRadioButton yellow = new JRadioButton("Yellow");

        ButtonGroup colorsGroup = new ButtonGroup();
        colorsGroup.add(black);
        colorsGroup.add(green);
        colorsGroup.add(yellow);

        JButton submit = new JButton("submit");
        submit.addActionListener(e -> {
            System.out.println(colorsGroup.getSelection());
        });

        frame.add(submit);
        frame.add(black);
        frame.add(green);
        frame.add(yellow);

        frame.pack();
        frame.setVisible(true);
    }
}
