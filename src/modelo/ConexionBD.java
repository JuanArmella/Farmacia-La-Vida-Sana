package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author migue
 */
public class ConexionBD {

    private String URL = "jdbc:mysql://localhost:3306/bd_farmacia";
    private String USER = "root";
    private String CLAVE = "";
    Connection con = null;

    public Connection conectarBD() {
        try {
            //Obtener valor del Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Obtener la conexion
            con = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (ClassNotFoundException e) {
            System.out.println("Ha ocurrido un ClassNotFoundException: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un SQLException " + e.getMessage());
        }
        return con;
    }

    public void desconectarBD() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Conexión cerrada exitosamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

}
