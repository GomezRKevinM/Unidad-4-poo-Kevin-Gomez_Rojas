package Taller15.Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultarDatos {

    public static ArrayList<Libro> libros(){
        String sql = "SELECT * FROM libros";
        try(Connection connection = DataConexion.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {
            if (!rs.isBeforeFirst()) {
                throw new SQLException("No hay datos");
            }
            ArrayList<Libro> libros = new ArrayList<>();
            while (rs.next()){
                Libro encontrado = new Libro(rs.getString("titulo"),
                                             rs.getString("autor"),
                                             rs.getTimestamp("fecha_publicacion"),
                                             rs.getInt("numero_paginas"),
                                             rs.getString("genero"),
                                             rs.getString("isbn"));
                libros.add(encontrado);
            }
            return libros;
        }catch (SQLException e){
           throw new RuntimeException("Error al consultar los libros: " + e.getMessage());
        }
    }

    public static Libro libro(String isbn){
        String sql = "SELECT * FROM libros WHERE isbn = ?";
        try(Connection connection = DataConexion.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();
            if (!rs.isBeforeFirst()) {
                throw new SQLException("No hay datos");
            }
            if (rs.next()) {
                return new Libro(rs.getString("titulo"),
                                 rs.getString("autor"),
                                 rs.getTimestamp("fecha_publicacion"),
                                 rs.getInt("numero_paginas"),
                                 rs.getString("genero"),
                                 rs.getString("isbn"));
            } else {
                throw new SQLException("Libro no encontrado");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar el libro: " + e.getMessage());
        }
    }
}
