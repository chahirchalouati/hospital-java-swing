/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import root.interfaces.FileService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;




/* chahir chalouati */


public class FileServiceImpl implements FileService {
    private BufferedWriter output;
    public FileServiceImpl() {
    }

    @Override
    public void write(String nameFile, String text) {
        try {
            File file = new File(String.format("%s.txt", nameFile));
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            output.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void save(JTable tab, String path, String split) {
        File file = new File(path + ".txt");
        DefaultTableModel model = (DefaultTableModel) tab.getModel();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(":");
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                String[] dataRow = line.split(":");
                model.addRow(dataRow);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        tab.setModel(model);

    }

}
