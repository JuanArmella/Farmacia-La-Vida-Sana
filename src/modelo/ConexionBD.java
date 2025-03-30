
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author migue
 */
public class ConexionBD {

    public static final String URL
            = "jdbc:mysql://localhost:3306/bd_farmacia";
    public static final String USER = "root";
    public static final String CLAVE = "";
    private Connection con;

    public void ConectarBD() {
        con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(
                    URL, USER, CLAVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void DesconectarBD() {
        try {
            if (con.isClosed() == false) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean ValidarUsuario(String usu, String pass) {
        try {
            Statement query = con.createStatement();
            ResultSet resultado = query.executeQuery(
                    "SELECT COUNT(*) AS TOTAL FROM "
                    + " usuarios WHERE usuario='" + usu + "'"
                    + " AND contrasena='" + pass + "'");
            if (resultado.next()) {
                if (resultado.getInt("TOTAL") > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
