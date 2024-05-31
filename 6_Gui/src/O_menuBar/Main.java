package O_menuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("0.png");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem importItem = new JMenuItem("Import");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.setMnemonic(KeyEvent.VK_F); // shortcut( alt + f )
        importItem.setMnemonic(KeyEvent.VK_I); // shortcut( i )
        importItem.setIcon(icon);
        exitItem.setForeground(Color.magenta);

        importItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));
            int num = fileChooser.showOpenDialog(null);
//            fileChooser.showSaveDialog(null);
            if (num == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        });

        fileMenu.add(openItem);
        fileMenu.add(importItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
