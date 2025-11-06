import java.sql.Connection;

public static void main(String[] args) {
    ConexionPostgreSQL conexion = new ConexionPostgreSQL();
    try (Connection conn = conexion.conectar()) {
        System.out.println("✅ Conexión exitosa con MySQL mediante XAMPP");
    } catch (Exception e) {
        System.out.println("❌ Error: " + e.getMessage());
    }
}