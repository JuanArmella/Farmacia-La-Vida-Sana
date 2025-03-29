
package modelo;


public class TestConexion {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.ConectarBD();
        System.out.println("Conexión exitosa");
        conexion.DesconectarBD();
    }
}

