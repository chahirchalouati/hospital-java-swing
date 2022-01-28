package root.interfaces;

import javax.swing.*;

public interface CRUDService {
    void save(JTable tab, String query);

    void update(JTable tab, String db);

    void delete(JTable tab, String db);
}
