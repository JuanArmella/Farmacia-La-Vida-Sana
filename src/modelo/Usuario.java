package modelo;

/**
 *
 * @author migue
 */
public class Usuario {

    //int IdUsuario;
    String Usuario;
    String Contraseña;
    //int IdRol;
    //int IdEmpleado;

    public Usuario() {
        //IdUsuario  = 0;
        Usuario = "";
        Contraseña = "";
        //IdRol= 0;
        //IdEmpleado= 0;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

}
