
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000, 0.15);
        GenerarEtiqueta generadorEtiqueta = new GenerarEtiqueta();

        System.out.println(generadorEtiqueta.generarEtiqueta(producto));
    }
}
