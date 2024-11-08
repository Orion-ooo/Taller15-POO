
package local;

/**
 *
 * @author Daniel
 */
public class Validacion {
    public boolean validando(Usuario usuarioIngresado, Usuario usuarioRegistrado){
        return usuarioIngresado.getCorreo().equalsIgnoreCase(usuarioRegistrado.getCorreo()) &&
               usuarioIngresado.getContrasena().equals(usuarioRegistrado.getContrasena());
    }
}
