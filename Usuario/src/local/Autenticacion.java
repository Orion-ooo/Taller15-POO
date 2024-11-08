
package local;

/**
 *
 * @author Daniel
 */
public class Autenticacion {
    private Validacion validacion;

    public Autenticacion() {
        this.validacion = new Validacion();
    }
    
    public void autenticarConCorreo(Usuario usuarioIngresado, Usuario usuarioRegistrado){
        System.out.println("Autenticando al usuario " + usuarioIngresado.getNombre());
        
        if (validacion.validando(usuarioIngresado, usuarioRegistrado)) {
            System.out.println("usuario autenticado con exito!");
        } else {
            System.out.println("usuario no autenticado: credenciales incorrectas...:(");
        }
    }
}
