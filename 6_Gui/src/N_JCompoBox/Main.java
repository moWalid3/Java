package N_JCompoBox;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel("Select your car type:");
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] cars = {"BMW", "Fiat", "Mercedes"};
        JComboBox<String> comboBox = new JComboBox<>(cars);

        comboBox.addItem("Kia");
        comboBox.insertItemAt("Audi", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("Fiat");
        comboBox.removeItemAt(3);
        comboBox.addActionListener(e -> {
            System.out.println(comboBox.getSelectedItem());
        });

        frame.add(label);
        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }
}
