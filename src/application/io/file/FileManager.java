package application.io.file;

import application.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
