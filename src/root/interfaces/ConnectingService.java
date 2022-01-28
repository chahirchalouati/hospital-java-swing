package root.interfaces;

import java.sql.*;

public interface ConnectingService {
    void connect(String connectionUrl);

    ResultSet result(String query);

    DatabaseMetaData metadata();

    ResultSetMetaData metadataResultSet();

    boolean executeQuery(String query);

    Connection connection();

    Statement statement();

    ResultSet resultSet();
}
