package app;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class WelcomePage {
    private JFrame frame;
    private JLabel welcomeLabel;
    private JButton createBtn, editBtn, exitBtn, showTitlesBtn;
    private FileManager fileManager;

    public WelcomePage(String name) {

        createWelcomeLabel(name);

        createShowTitlesBtn(name);

        createCreateBtn(name);

        createEditBtn(name);

        createExitBtn();

        createFrame();
    }

    private void createFrame() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLocation(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFF9800));

        frame.add(exitBtn);
        frame.add(createBtn);
        frame.add(editBtn);
        frame.add(showTitlesBtn);
        frame.add(welcomeLabel);
        frame.setVisible(true);
    }

    private void createWelcomeLabel(String name) {
        welcomeLabel = new JLabel();
        welcomeLabel.setText("Welcome " + name);
        welcomeLabel.setFont(new Font("Georgia", Font.BOLD, 20));
        welcomeLabel.setBounds(90, 60, 350, 50);
    }

    private void createShowTitlesBtn(String name) {
        showTitlesBtn = new JButton("Show notes Title");
        showTitlesBtn.setFocusable(false);
        showTitlesBtn.setBounds(45, 200, 300, 25);
        showTitlesBtn.setFont(new Font("Georgia", Font.ITALIC, 15));
        showTitlesBtn.addActionListener(e -> {
            fileManager = new FileManager();
            Set<String> titleList = fileManager.listDirectory("users_note/" + name);
            String dirs = "";
            for (String dirName : titleList) {
                dirs = dirs.concat(dirName).concat("\n");
            }

            if (dirs.isEmpty()) {
                JOptionPane.showMessageDialog(null, "You don't have any notes yet!");
            } else {
                JOptionPane.showMessageDialog(null, dirs);
            }
        });
    }

    private void createCreateBtn(String name) {
        createBtn = new JButton("Create note");
        createBtn.setFocusable(false);
        createBtn.setBounds(40, 250, 150, 50);
        createBtn.setFont(new Font("Georgia", Font.PLAIN, 20));
        createBtn.addActionListener(e -> {
            String title = JOptionPane.showInputDialog(null, "Enter the title for note:");
            FileManager fileManager = new FileManager();
            fileManager.createFolder("users_note/" + name + "/" + title);
            frame.dispose();
            new CreateNote(name, title);
        });
    }

    private void createEditBtn(String name) {
        editBtn = new JButton("Edit note");
        editBtn.setFocusable(false);
        editBtn.setBounds(200, 250, 150, 50);
        editBtn.setFont(new Font("Georgia", Font.PLAIN, 20));
        editBtn.addActionListener(e -> {
            String title = JOptionPane.showInputDialog(null, "Enter the title for note:");
            frame.dispose();
            new EditNote(name, title);
        });
    }

    private void createExitBtn() {
        exitBtn = new JButton("Exit");
        exitBtn.setFocusable(false);
        exitBtn.setBounds(120, 310, 160, 30);
        exitBtn.setFont(new Font("Georgia", Font.PLAIN, 25));
        exitBtn.addActionListener(e -> frame.dispose());
    }
}
