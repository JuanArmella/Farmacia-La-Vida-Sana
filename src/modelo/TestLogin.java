/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
public class TestLogin {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Prueba con un usuario y contraseña correctos
        String usuarioIngresado = "admin123";  // Reemplaza con un usuario de tu BD
        String contraseñaIngresada = "adminpass"; // Reemplaza con la contraseña correcta

        Usuario usuario = usuarioDAO.loginUsuario(usuarioIngresado, contraseñaIngresada);

        if (usuario != null) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario.getUsuario());
            System.out.println("ID Usuario: " + usuario.getIdUsuario());
            System.out.println("Rol: " + usuario.getIdRol());
            System.out.println("ID Empleado: " + usuario.getIdEmpleado());
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}



