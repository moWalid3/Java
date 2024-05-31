package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class FileManager {
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public void createFolder(String path) {
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException ignored) {
        }

    }

    public void addUser(User user) {
        try {
            createFolder("users_note/" + user.getName());
            FileWriter fileWriter = new FileWriter("users.txt", true);
            fileWriter.write(user.getName() + "|" + user.getPassword() + "\n");
            fileWriter.close();

        } catch (Exception ignored) {
        }
    }

    public boolean isUserExist(User user) {
        boolean matched = false;
        String name = user.getName();
        String pass = user.getPassword();
        try {
            fileReader = new FileReader("users.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(name + "|" + pass)) {
                    matched = true;
                    break;
                }
            }
            fileReader.close();

        } catch (Exception ignored) {
        }
        return matched;
    }

    public String getContentFile(String path) {
        String content = "";
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content = content.concat(line).concat("\n");
            }
            fileReader.close();

        } catch (Exception ignored) {
        }
        return content;
    }

    public Set<String> listFilesImagesAndSketches(String directoryPath) {
        Set<String> fileSet = new HashSet<>();
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directoryPath));
            for (Path path : stream) {
                if (!Files.isDirectory(path) && !path.getFileName().toString().equals("note.txt")) {
                    fileSet.add(path.getFileName().toString());
                }
            }
            stream.close();
        } catch (IOException ignored) {
        }
        return fileSet;
    }

    public Set<String> listDirectory(String directoryPath) {
        Set<String> fileSet = new HashSet<>();
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directoryPath));
            for (Path path : stream) {
                if (Files.isDirectory(path) && !path.getFileName().toString().equals("note.txt")) {
                    fileSet.add(path.getFileName().toString());
                }
            }
            stream.close();
        } catch (IOException ignored) {
        }
        return fileSet;
    }

}
