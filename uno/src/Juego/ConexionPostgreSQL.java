
package Juego;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
/**
 *
 * @author tree6
 */
public class ConexionPostgreSQL {
    
	private static final String BD_URL = "jdbc:postgresql://localhost:5432/Uno";
    private static final String USER = "postgres";
    private static final String PASS = "Holas123";
    
    /**
     * Abre una conexión con la base de datos PostgreSQL.
     */
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(BD_URL, USER, PASS);
    }
    
    /**
     * Guarda los datos de un jugador en la tabla Uno.
     */
    public void savePlayer(int id, String name, int score, String date) {
        String sql = "INSERT INTO Uno(id_player, name, score, date) VALUES (?, ?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, score);
            ps.setString(4, date);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "✅ Puntuación guardada correctamente en la BD");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al guardar datos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Devuelve todos los jugadores registrados en la base de datos.
     */
    public List<Datos> viewPlayers() {
        List<Datos> lista = new ArrayList<>();
        String sql = "SELECT id_player, name, score, date FROM Uno";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Datos d = new Datos();
                d.setId(rs.getInt("id_player"));
                d.setName(rs.getString("name"));
                d.setScore(rs.getInt("score"));
                d.setDate(rs.getString("date"));
                lista.add(d);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al consultar datos: " + e.getMessage());
        }

        return lista;
    }
}
