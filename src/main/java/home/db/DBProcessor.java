package home.db;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Козак on 10.11.2016.
 */
public class DBProcessor {

    private Connection connection;

    public DBProcessor() throws SQLException { // конструктор класса регистрирует драйвер
        Driver driver = new FabricMySQLDriver();
        DriverManager.registerDriver(driver);
    }

    public Connection getConnection(String url, String username, String password) throws SQLException {
        if(connection != null) {
            return connection;
        } else connection = DriverManager.getConnection(url, username, password); // метод возвращает соединение
        System.out.println("DB is connected!");
        return connection;
    }
}
