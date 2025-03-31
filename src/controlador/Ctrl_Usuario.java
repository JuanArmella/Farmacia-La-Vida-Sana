package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.Menu;
import vista.login;

/**
 *
 * @author migue
 */
public class Ctrl_Usuario implements ActionListener {

    private Usuario usuario;
    private UsuarioDAO usuarioDAO;
    private login loginVista;

    public Ctrl_Usuario(Usuario usuario, UsuarioDAO usuarioDAO, login loginVista) {
        this.usuario = usuario;
        this.usuarioDAO = usuarioDAO;
        this.loginVista = loginVista;
        this.loginVista.btnIngresar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Obtener los datos de la vista
        String user = loginVista.txtUser.getText().trim();
        String pass = String.valueOf(loginVista.txtContra.getPassword());

        if (e.getSource() == loginVista.btnIngresar) {
            //Validar que los campos no estan vacios
            if (!user.equals("") || !pass.equals("")) {
                //Pasar los parametros al metodo login
                usuario = usuarioDAO.loginUsuario(user, pass);
                //Verificar la existencia del usuario
                if (usuario.getUsuario() != null) {
                    if(usuario.getIdRol() == 1){
                        Menu ventana1 = new Menu();
                        ventana1.setVisible(true);
                    }else{
                        Menu ventana1 = new Menu();
                        ventana1.setVisible(true);
                    }
                    this.loginVista.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Los campos esta vacios");
            }
        }
    }

}
