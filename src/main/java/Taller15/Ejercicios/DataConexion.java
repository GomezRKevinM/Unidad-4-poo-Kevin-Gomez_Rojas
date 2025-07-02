package Taller15.Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConexion {
    private static final String URL = "jdbc:sqlite:src/main/java/Taller15/Ejercicios/tallerDB.sqlite";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
