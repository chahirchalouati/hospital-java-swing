/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import root.interfaces.ConnectingService;

import javax.swing.*;
import java.sql.*;

/**
 * @author chahir
 */
public class ConnectingServiceImpl implements ConnectingService {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData resultSetMetaData;
    private DatabaseMetaData databaseMetaData;

    public ConnectingServiceImpl() {
    }

    @Override
    public void connect(String connectionUrl) {
        try {
            Class.forName("org.sqlite.JDBC");
            String url = String.format("jdbc:sqlite::resource:%s", connectionUrl);
            this.connection = DriverManager.getConnection(url);
            this.statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public ResultSet result(String query) {
        try {
            this.resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.resultSet;
    }

    @Override
    public DatabaseMetaData metadata() {
        try {
            this.databaseMetaData = this.connection.getMetaData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.databaseMetaData;
    }

    @Override
    public ResultSetMetaData metadataResultSet() {
        try {
            this.resultSetMetaData = this.resultSet.getMetaData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.resultSetMetaData;
    }

    @Override
    public boolean executeQuery(String query) {
        try {
            this.resultSet = this.statement().executeQuery(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Connection connection() {
        return connection;
    }

    @Override
    public Statement statement() {
        return statement;
    }
    @Override
    public ResultSet resultSet() {
        return resultSet;
    }

}
