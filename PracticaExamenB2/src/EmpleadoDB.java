import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmpleadoDB {
    public static final String DB_URL = "jdbc:sqlite:empresa.db";

    public EmpleadoDB(){
        crearTabla();
    }

    private void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS empleados (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " nombre TEXT NOT NULL,\n"
                + " rol TEXT NOT NULL,\n"
                + " horas_trabajadas INTEGER NOT NULL,\n"
                + " salario REAL NOT NULL\n"
                + ");";

        try (java.sql.Connection conn = java.sql.DriverManager.getConnection(DB_URL);
             java.sql.Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (java.sql.SQLException e) {
            System.out.println("Error al crear la tabla" + e.getMessage());
        }
    }
        public void guardarEmpleado(EmpleadoB empleado) {
            String sql = "INSERT INTO empleados(nombre, rol, horas_trabajadas, salario) VALUES(?,?,?,?)";

            try (java.sql.Connection conn = java.sql.DriverManager.getConnection(DB_URL);
                 java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, empleado.getNombre());
                pstmt.setString(2, empleado.getRol());
                pstmt.setInt(3, empleado.getHorasTrabajadas());
                pstmt.setDouble(4, empleado.calcularSalario());
                pstmt.executeUpdate();
            } catch (java.sql.SQLException e) {
                System.out.println("Error al guardar Empleado" + e.getMessage());
            }
        }

    public void mostrarEmpleados() {
        String sql = "SELECT nombre, rol, horas_trabajadas, salario FROM empleados";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        "Nombre: " + rs.getString("nombre") +
                                ", Rol: " + rs.getString("rol") +
                                ", Horas: " + rs.getInt("horas_trabajadas") +
                                ", Salario: " + rs.getDouble("salario")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al leer empleados: " + e.getMessage());
        }
    }

}

