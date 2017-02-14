package home.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Козак on 10.11.2016.
 */
public class Main {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mydb_1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String args[]) throws SQLException {

        DBProcessor processor = new DBProcessor(); // объект класса
        Connection c = processor.getConnection(URL, USERNAME, PASSWORD); // вызов метода
        String query = "select * from users"; // наш запрос к базе
        Statement statement = c.createStatement(); // создание стейтмента
        ResultSet resultSet = statement.executeQuery(query); // результат с запроса

        while(resultSet.next()) {
            int id,age;
            String name,email;
            id = resultSet.getInt("ID");
            name = resultSet.getString("name");
            email = resultSet.getString("email");
            age = resultSet.getInt("age");
            Worker worker = new Worker(id,name,age,email);
            //Worker worker = new Worker(name); // все значения кроме "name,password" заменяются "null"
            System.out.println(worker);
        }

        statement.close();
        c.close();
    }
}
