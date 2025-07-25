import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ProductosDB {
    public static final String DB_URL = "jdbc:sqlite:tienda.db";

    public ProductosDB(){
        crearTabla();
    }

    private void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS productos (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " tipo TEXT NOT NULL,\n"
                + " nombre TEXT NOT NULL,\n"
                + " precio REAL NOT NULL\n"
                + ");";

        try (java.sql.Connection conn = java.sql.DriverManager.getConnection(DB_URL);
             java.sql.Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (java.sql.SQLException e) {
            System.out.println("Error al crear la tabla" + e.getMessage());
        }
    }
    public void guardarProducto(Producto producto) {
        String sql = "INSERT INTO productos(tipo, nombre, precio) VALUES(?,?,?)";

        try (java.sql.Connection conn = java.sql.DriverManager.getConnection(DB_URL);
             java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, producto.getTipo());
            pstmt.setString(2, producto.getNombre());
            pstmt.setDouble(3, producto.getPrecio());
            pstmt.executeUpdate();
        } catch (java.sql.SQLException e) {
            System.out.println("Error al guardar producto" + e.getMessage());
        }
    }

    public void mostrarProductos() {
        String sql = "SELECT nombre, precio FROM productos";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        "Nombre: " + rs.getString("nombre") +
                                ", Precio: " + rs.getString("precio")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al leer productos: " + e.getMessage());
        }
    }

}

