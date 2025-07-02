package Taller15.Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDatos {
    public static void updateLibro(Libro libro) {
        String sql = "UPDATE libros SET titulo = ?, autor = ?, fecha_publicacion = ?, numero_paginas = ?, genero = ? WHERE isbn = ?";
        try (Connection connection = DataConexion.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, libro.getTitulo());
            pstmt.setString(2, libro.getAutor());
            pstmt.setTimestamp(3, libro.getAnioPublicacion());
            pstmt.setInt(4, libro.getNumeroPaginas());
            pstmt.setString(5, libro.getGenero());
            pstmt.setString(6, libro.getIsbn());
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No se actualizó ningún libro");
            }else{
                System.out.println("Libro actualizado correctamente");
                System.out.println(libro.toString());
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar el libro: " + e.getMessage());
        }
    }
}
