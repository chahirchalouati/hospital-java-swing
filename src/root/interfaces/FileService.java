package root.interfaces;

import javax.swing.*;

public interface FileService {
    void write(String nameFile, String text);

    void save(JTable tab, String path, String split);
}
