package app;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class EditNote {
    JFrame frame;
    JLabel label;
    JTextArea textArea;
    JButton addImageBtn, addSketchBtn, showImagesAndSketchBtn, saveBtn, exitBtn;
    FileManager fileManager;

    public EditNote(String name, String title) {

        createLabel();

        createTextArea(name, title);

        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setBounds(20, 50, 350, 300);

        createAddImageBtn(name, title);

        createAddSketchBtn(name, title);

        createShowImagesAndSketchBtn(name, title);

        createSaveBtn(name, title);

        createExitBtn();

        createFrame(scrollPane);
    }

    private void createFrame(JScrollPane scrollPane) {
        frame = new JFrame();
        frame.setSize(400, 600);
        frame.setLocation(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFF9800));

        frame.add(exitBtn);
        frame.add(showImagesAndSketchBtn);
        frame.add(saveBtn);
        frame.add(addImageBtn);
        frame.add(addSketchBtn);
        frame.add(label);
        frame.add(scrollPane);
        frame.setVisible(true);
    }

    private void createLabel() {
        label = new JLabel("Text note:");
        label.setBounds(20, 20, 200, 30);
        label.setFont(new Font("Georgia", Font.BOLD, 20));
    }

    private void createTextArea(String name, String title) {
        textArea = new JTextArea();
        textArea.setFont(new Font("Georgia", Font.BOLD, 20));
        textArea.setForeground(new Color(0x191D88));
        textArea.setCaretColor(Color.red);

        fileManager = new FileManager();
        String content = fileManager.getContentFile("users_note/" + name + "/" + title + "/" + "note.txt");

        textArea.setText(content);
    }

    private void createAddImageBtn(String name, String title) {
        addImageBtn = new JButton("Add image");
        addImageBtn.setFocusable(false);
        addImageBtn.setBounds(40, 400, 150, 50);
        addImageBtn.setFont(new Font("Georgia", Font.PLAIN, 20));
        addImageBtn.addActionListener(e -> {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));
            int num = fileChooser.showOpenDialog(null);

            if (num == JFileChooser.APPROVE_OPTION) {

                String sourceImagePath = fileChooser.getSelectedFile().getAbsolutePath();
                String destinationFolderPath = "users_note/" + name + "/" + title;
                try {

                    Path sourcePath = Paths.get(sourceImagePath);
                    Path destinationPath = Paths.get(destinationFolderPath, sourcePath.getFileName().toString());

                    Files.copy(sourcePath, destinationPath);

                } catch (IOException ignored) {
                }
            }

        });
    }

    private void createAddSketchBtn(String name, String title) {
        addSketchBtn = new JButton("Add Sketch");
        addSketchBtn.setFocusable(false);
        addSketchBtn.setBounds(200, 400, 150, 50);
        addSketchBtn.setFont(new Font("Georgia", Font.PLAIN, 20));
        addSketchBtn.addActionListener(e -> {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));
            int num = fileChooser.showOpenDialog(null);

            if (num == JFileChooser.APPROVE_OPTION) {

                String sourceSketchPath = fileChooser.getSelectedFile().getAbsolutePath();
                String destinationFolderPath = "users_note/" + name + "/" + title;
                try {

                    Path sourcePath = Paths.get(sourceSketchPath);
                    Path destinationPath = Paths.get(destinationFolderPath, sourcePath.getFileName().toString());

                    Files.copy(sourcePath, destinationPath);

                } catch (IOException ignored) {
                }
            }

        });
    }

    private void createShowImagesAndSketchBtn(String name, String title) {
        showImagesAndSketchBtn = new JButton("Show images and sketches");
        showImagesAndSketchBtn.setFocusable(false);
        showImagesAndSketchBtn.setBounds(45, 365, 300, 20);
        showImagesAndSketchBtn.setFont(new Font("Georgia", Font.ITALIC, 15));
        showImagesAndSketchBtn.addActionListener(e -> {
            String show = "";
            Set<String> imageAndSketchFileNameList = fileManager.listFilesImagesAndSketches("users_note/" + name + "/" + title);

            for (String fileName : imageAndSketchFileNameList) {
                show = show.concat(fileName).concat("\n");
            }
            JOptionPane.showMessageDialog(null, show);
        });
    }

    private void createSaveBtn(String name, String title) {
        saveBtn = new JButton("Save");
        saveBtn.setFocusable(false);
        saveBtn.setBounds(100, 460, 200, 40);
        saveBtn.setFont(new Font("Georgia", Font.PLAIN, 25));
        saveBtn.addActionListener(e -> {
            try {

                FileWriter fileWriter = new FileWriter("users_note/" + name + "/" + title, true);
                fileWriter.write(textArea.getText());
                fileWriter.close();

            } catch (Exception ignored) {
            }

            frame.dispose();
            new WelcomePage(name);
        });
    }

    private void createExitBtn() {
        exitBtn = new JButton("Exit");
        exitBtn.setFocusable(false);
        exitBtn.setBounds(120, 510, 160, 30);
        exitBtn.setFont(new Font("Georgia", Font.PLAIN, 25));
        exitBtn.addActionListener(e -> frame.dispose());
    }
}
