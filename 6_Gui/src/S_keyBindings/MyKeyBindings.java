package S_keyBindings;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyKeyBindings {
    JFrame frame = new JFrame("key bindings");
    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("1.png");
    Action moveUp = new UpAction();
    Action moveDown = new DownAction();
    Action moveLeft = new LeftAction();
    Action moveRight = new RightAction();

    MyKeyBindings() {
        label.setIcon(icon);
        label.setBounds(50, 50, 130, 130);

        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "moveUp");
        label.getActionMap().put("moveUp", moveUp);

        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "moveDown");
        label.getActionMap().put("moveDown", moveDown);

        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "moveLeft");
        label.getActionMap().put("moveLeft", moveLeft);

        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "moveRight");
        label.getActionMap().put("moveRight", moveRight);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
    }

    class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
