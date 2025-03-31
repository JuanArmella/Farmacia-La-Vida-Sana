package modelo;

/**
 *
 * @author migue
 */
public class Usuario {

    private int IdUsuario;
    private String Usuario;
    private String Contraseña;
    private int IdRol;
    private int IdEmpleado;

    public Usuario() {

    }

    public Usuario(int IdUsuario, String Usuario, String Contraseña, int IdRol, int IdEmpleado) {
        this.IdUsuario = IdUsuario;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.IdRol = IdRol;
        this.IdEmpleado = IdEmpleado;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
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

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

}
