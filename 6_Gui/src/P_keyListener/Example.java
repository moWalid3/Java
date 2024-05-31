package P_keyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Example extends JFrame implements KeyListener {
    ImageIcon icon;
    JLabel label;

    Example() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.orange.darker());
        this.addKeyListener(this);

        icon = new ImageIcon("0.png");
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(0, 0, 100, 100);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' -> label.setLocation(label.getX(), label.getY() - 10);
            case 's' -> label.setLocation(label.getX(), label.getY() + 10);
            case 'a' -> label.setLocation(label.getX() - 10, label.getY());
            case 'd' -> label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 -> label.setLocation(label.getX(), label.getY() - 10);
            case 40 -> label.setLocation(label.getX(), label.getY() + 10);
            case 37 -> label.setLocation(label.getX() - 10, label.getY());
            case 39 -> label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
    }
}
