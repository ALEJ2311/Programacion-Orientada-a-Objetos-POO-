
import org.junit.*;
import static org.junit.Assert.*;
import java.sql.*;

public class VehiculodbTest {

    static Vehiculodb db;

    @BeforeClass
    public static void setUpBeforeClass() {
        db = new Vehiculodb() {
            {
                this.url = "jdbc:sqlite:TestVehiculos.db";  // base de datos de prueba
            }
        };

        try (Connection conn = db.conectar()) {
            if (conn != null) {
                String sql = "CREATE TABLE IF NOT EXISTS vehiculos (" +
                             "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                             "tipo TEXT, marca TEXT, modelo TEXT)";
                Statement stmt = conn.createStatement();
                stmt.execute(sql);
            } else {
                fail("No se pudo establecer la conexión para crear la tabla.");
            }
        } catch (SQLException e) {
            fail("Excepción al crear la tabla: " + e.getMessage());
        }
    }

    @Before
    public void limpiarTabla() {
        try (Connection conn = db.conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute("DELETE FROM vehiculos");
        } catch (SQLException e) {
            fail("Error al limpiar la tabla: " + e.getMessage());
        }
    }

    @Test
    public void testGuardarVehiculo() {
        db.guardarVehiculo("Auto", "Ferrari", "Purosangue");

        try (Connection conn = db.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM vehiculos WHERE marca = 'Ferrari' AND modelo = 'Purosangue'")) {

            assertTrue("No se encontró el vehículo guardado", rs.next());
            assertEquals("Auto", rs.getString("tipo"));

        } catch (SQLException e) {
            fail("Excepción SQL: " + e.getMessage());
        }
    }

    @AfterClass
    public static void eliminarDB() {
        
        java.io.File dbFile = new java.io.File("TestVehiculos.db");
        if (dbFile.exists()) {
            dbFile.delete();
        }
    }
}
