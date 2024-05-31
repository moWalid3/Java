
import service.PersonViewerService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        PersonViewerService personViewerService = new PersonViewerService();
        PersonViewerService.startFile();
        personViewerService.mainMenu();
    }
}