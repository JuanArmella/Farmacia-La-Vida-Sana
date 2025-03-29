/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */

public class TestConexion {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.ConectarBD();
        System.out.println("Conexión exitosa");
        conexion.DesconectarBD();
    }
}

