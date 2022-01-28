package root;

import root.interfaces.CRUDService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;


public class Component extends ConnectingServiceImpl implements CRUDService {

    public String path;
    public boolean value = false;

    public Component() {
    }

    public Component(String url) {
        this.connect(url);
    }

    public ImageIcon Resize(String imagePath, byte[] pic, JLabel lbl) {
        ImageIcon myImage;
        if (imagePath != null) {
            myImage = new ImageIcon(imagePath);
        } else {
            myImage = new ImageIcon(pic);
        }
        Image image = myImage.getImage();
        Image newImage = image.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);

        return new ImageIcon(newImage);
    }

    public void FileChoose(JButton btn, JLabel label) {
        try {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select image");
            fileChooser.showDialog(btn, "Select");
            path = fileChooser.getSelectedFile().getAbsolutePath();
            label.setIcon(Resize(path, null, label));
            value = true;
        } catch (NullPointerException | HeadlessException e) {
            value = false;
            JOptionPane.showMessageDialog(null, "nothing selected !");
        }


    }

    private byte[] getByteArrayFromFile() {
        byte[] result = null;
        FileInputStream fileInStr;
        try {
            File imgFile = new File(path);
            fileInStr = new FileInputStream(imgFile);
            long imageSize = imgFile.length();

            if (imageSize > Integer.MAX_VALUE) {
                return null;    //image is too large  
            }

            if (imageSize > 0) {
                result = new byte[(int) imageSize];
                fileInStr.read(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addImage(String db, String column, String _id, int id) {
        String query = String.format("UPDATE %s SET %s=? WHERE %s= %d", db, column, _id, id);
        PreparedStatement preparedStatement;
        try {
            preparedStatement = this.connection().prepareStatement(query);
            byte[] imageFileArr = getByteArrayFromFile();
            preparedStatement.setBytes(1, imageFileArr);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Image saved successfully!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void getImage(String db, String column, String idcolumn, int id, JLabel lbl) {
        Image image;
        String query = String.format("select %s from %s where %s=%d", column, db, idcolumn, id);
        try {
            this.executeQuery(query);
            if (this.resultSet().next()) {
                byte[] resultSetBytes = this.resultSet().getBytes(1);
                image = Toolkit.getDefaultToolkit().createImage(resultSetBytes);
                Image newImage = image.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon img1 = new ImageIcon(newImage);
                lbl.setIcon(img1);
                value = true;
            }

        } catch (NullPointerException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No Image Found", "Error", JOptionPane.INFORMATION_MESSAGE);
            value = false;
        }

    }

    public void showdbTabella(JTable tab, String db, int x) {
// un metodo per visualizzare i le tabelle del data base in una tabella
        try {
            String query = String.format("SELECT * FROM '%s'", db);
            this.executeQuery(query);
            JTable table = new JTable(costruireTableModel(x));
            tab.setModel(table.getModel());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public DefaultTableModel costruireTableModel(int x) throws SQLException {
        //nomi delle column
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metadataResultSet().getColumnCount();
        for (int column = 1; column <= columnCount - x; column++) {
            columnNames.add(metadataResultSet().getColumnName(column));
        }
        // dati della tabella
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (this.resultSet().next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount - x; columnIndex++) {
                vector.add(this.resultSet().getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }

    public void addCombo(JComboBox<String> cbx, String db, int x) {
        JComboBox<String> comboBox = new JComboBox<>();
        try {
            String query = String.format("SELECT * FROM '%s'", db);
            this.executeQuery(query);
            int columnCount = metadataResultSet().getColumnCount();
            for (int i = 1; i <= columnCount - x; i++) {
                cbx.addItem(metadataResultSet().getColumnName(i));
            }
            cbx.setModel(comboBox.getModel());
        } catch (SQLException ignored) {
        }
    }

    @Override
    public void save(JTable tab, String query) {
        // un metodo per inserire nella tabella e aggiornando anche i dati su la tabella in swing
        this.executeQuery(query);
    }

    public void CercaInDB(String db, JTextField txtCerca, JTable tab, JComboBox<String> cbx, int x) {
        try {
            String query = String.format("SELECT * FROM `%s` WHERE `%s` LIKE '%%%s%%'", db, cbx.getSelectedItem(), txtCerca.getText());
            this.executeQuery(query);
            JTable table = new JTable(costruireTableModel(x));
            tab.setModel(table.getModel());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void update(JTable tab, String db) {
        try {
            if (tab.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "seleziona campo da modificare ");
            } else {
                int row = tab.getSelectedRow();
                for (int i = 1; i < tab.getColumnCount(); i++) {
                    String query = String.format("UPDATE %s SET %s='%s' WHERE  %s=%s", db, tab.getColumnName(i), tab.getValueAt(row, i), tab.getColumnName(0), tab.getValueAt(row, 0));
                    this.statement().executeUpdate(query);
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    @Override
    public void delete(JTable tab, String db) {
        try {
            if (tab.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "seleziona campo da modificare ");
            } else {
                int row = tab.getSelectedRow();
                for (int i = 1; i < tab.getColumnCount(); i++) {
                    String query = String.format(" DELETE FROM %s WHERE  %s=%s", db, tab.getColumnName(0), tab.getValueAt(row, 0));
                    this.executeQuery(query);
                }
                JOptionPane.showMessageDialog(null, "Modifiche Applicate");
            }
        } catch (HeadlessException ignored) {
        }
    }

    public void Combo(JComboBox cbx, String query) {

        JComboBox cbxqua = new JComboBox();
        try {
            int columnCount = metadataResultSet().getColumnCount();
            while (this.resultSet().next()) {
                for (int i = 1; i <= columnCount; i++) {
                    cbxqua.addItem(this.resultSet().getObject(i));
                }
            }
            cbx.setModel(cbxqua.getModel());

        } catch (SQLException ignored) {
        }

    }

    public void showTableQuery(JTable tab, String query) {
        try {
            this.executeQuery(query);
            JTable table = new JTable(costruireTableModel(0));
            tab.setModel(table.getModel());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public boolean isValue() {
        return value;
    }

}
