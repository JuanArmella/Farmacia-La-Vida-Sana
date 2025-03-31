/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    //Instanciar la conexion
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst; //Sirve para las consultas
    ResultSet rs; //Sirve para obtener datos de las consultas

    //Variables para enviar datos entre interfaces
    public static int idUsuario = 0;
    public static String Usuario = "";
    public static int IdRol = 0;
    public static int IdEmpleado = 0;

    //Metodo login 
    public Usuario loginUsuario(String user, String pass) {
        String query = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?; ";
        Usuario usuario = new Usuario();
        //Usuario usuario = null;
        try {
            con = cn.conectarBD();
            pst = con.prepareStatement(query);
            //Enviar parametros
            pst.setString(1, user);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();// Probando
                usuario.setIdUsuario(rs.getInt("ID"));
                idUsuario = usuario.getIdUsuario();
                usuario.setUsuario(rs.getString("usuario"));
                Usuario = usuario.getUsuario();
                usuario.setIdRol(rs.getInt("id_rol"));
                IdRol = usuario.getIdRol();
                usuario.setIdEmpleado(rs.getInt("Id_empleado")); // Se agregó esto si es necesario
                IdEmpleado = usuario.getIdEmpleado();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener al usuario " + e);

        }
        return usuario;
    }
    /* public boolean ValidarUsuario(String usu, String pass) {
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
     */
}
