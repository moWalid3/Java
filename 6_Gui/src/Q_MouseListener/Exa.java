package Q_MouseListener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exa extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon icon0;
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;

    Exa() {
        this.setLayout(null);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        icon0 = new ImageIcon("0.png");
        icon1 = new ImageIcon("1.png");
        icon2 = new ImageIcon("2.png");
        icon3 = new ImageIcon("3.png");

        label = new JLabel();
        label.setBounds(100, 100, 130, 130);
        label.setIcon(icon0);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(icon2);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(icon3);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(icon1);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(icon0);
    }
}
