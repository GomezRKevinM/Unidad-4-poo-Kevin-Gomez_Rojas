package Taller15.Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarDatos {
    public static void eliminarLibro(String isbn) {
        String sql = "DELETE FROM libros WHERE isbn = ?";
        try(Connection conn = DataConexion.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, isbn);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No se encontró el libro con ISBN: " + isbn);
            }else{
                System.out.println("Libro eliminado correctamente con ISBN: " + isbn);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar el libro: " + e.getMessage());
        }
    }
}
