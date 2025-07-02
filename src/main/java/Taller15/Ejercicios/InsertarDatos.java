package Taller15.Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarDatos {
    public static void insertarLibro(Libro libro) {
        String sql = "INSERT INTO libros (titulo, autor, fecha_publicacion, numero_paginas, genero, isbn) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection conn = DataConexion.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, libro.getTitulo());
            pstmt.setString(2, libro.getAutor());
            pstmt.setTimestamp(3, libro.getAnioPublicacion());
            pstmt.setInt(4, libro.getNumeroPaginas());
            pstmt.setString(5, libro.getGenero());
            pstmt.setString(6, libro.getIsbn());
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Libro insertado correctamente");
                System.out.println(libro.toString());
            } else {
                throw new SQLException("No se insertó ningún libro");
            }

        }catch (SQLException e){
            throw new RuntimeException("Error al insertar el libro: " + e.getMessage());
        }
    }
}
