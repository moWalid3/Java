package B_Panels;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel("Welcome");

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.yellow);
        panel1.setBounds(0, 0, 100, 150);
        panel1.add(label);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.green);
        panel2.setBounds(100, 0, 100, 150);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.red);
        panel3.setBounds(200, 0, 100, 150);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.pink);
        panel4.setBounds(0, 150, 300, 250);

        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Panels");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

    }
}