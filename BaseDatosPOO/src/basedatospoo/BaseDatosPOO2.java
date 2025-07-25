/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatospoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class BaseDatosPOO2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tcl = new Scanner(System.in);
        System.out.println("GESTION DE LA BASE DE DATOS CON SQLITE");
        //String url="jdbc:sqlite:bd/userdb.db";

        String url = "jdbc:sqlite:userdb.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexión establecida a SQLite.");

                // Crear tabla
                String sqlCrear = "CREATE TABLE IF NOT EXISTS estudiantes (id INTEGER PRIMARY KEY, nombre TEXT, edad int, edadT TEXT)";
                Statement stmt = conn.createStatement();
                stmt.execute(sqlCrear);

                // Insertar datos
                
                String Estudiantes[] = {"Maria", "Pedro", "Juan", "Leonardo", "Byron", "Karla"};
                 String sqlInsertarE;
                for (int i = 0; i < Estudiantes.length; i++) {
                    System.out.println("Estudiante: " + Estudiantes[i]);
                    System.out.println("Ingrese su edad: ");
                    int edad = tcl.nextInt();
                    String edadT;
                    if (edad < 18) {
                        edadT = "Menor de Edad";
                        sqlInsertarE = "INSERT INTO estudiantes(nombre, edad, edadT) VALUES('" + Estudiantes[i] + "', " + edad + ", '" + edadT + "')";
                    } else {
                        edadT = "Mayor de Edad";
                        sqlInsertarE = "INSERT INTO estudiantes(nombre, edad, edadT) VALUES('" + Estudiantes[i] + "', " + edad + ", '" + edadT + "')";
                    }
                    stmt.execute(sqlInsertarE);
                }
// Consultar datos
                String sqlSelect = "SELECT * FROM estudiantes";
                ResultSet rs;
                rs = stmt.executeQuery(sqlSelect);

                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getInt("edad") + " - " + rs.getString("edadT"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con SQLite: " + e.getMessage());
        }

        System.out.println("--- FIN DEL PROGRAMA ---");
    }
}
