package db_conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private String jdbcURL = "jdbc:mysql://localhost:3306/resort_furama";

    private String jdbcUsername = "root";

    private String jdbcPassword = "123456";

    public Connection getConnection() {

        Connection connection = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

        } catch (SQLException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        } catch (ClassNotFoundException e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }

        return connection;
    }

}
