package Main;

import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    public Statement setConnection() throws SQLException {
        Connection connect = (Connection) DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/Dungeon",
                "barbudo", "267"
        );
        return connect.createStatement();
    }
}