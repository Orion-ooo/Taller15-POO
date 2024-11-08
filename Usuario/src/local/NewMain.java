
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {
    public static void main(String[] args) {
        CrearUsuario crearUsuario = new CrearUsuario();
        
        Usuario usuarioRegistrado = new Usuario("Daniel", 25, "daniel@correo.com", "contrasena123");
        Usuario usuarioIngresado = crearUsuario.crearUsuario();
        Autenticacion autenticacion = new Autenticacion();
        autenticacion.autenticarConCorreo(usuarioIngresado, usuarioRegistrado);
    }
}
