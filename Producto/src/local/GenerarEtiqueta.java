
package local;

/**
 *
 * @author Daniel
 */
public class GenerarEtiqueta {
    private CalcularPrecio calcularPrecio;

    public GenerarEtiqueta() {
        this.calcularPrecio = new CalcularPrecio();
    }
    
    public String generarEtiqueta(Producto producto){
        double precioFinal = calcularPrecio.calcularPrecioFinal(producto);
        return "Producto: " + producto.getNombre() + "\nPrecio final: " + precioFinal + "$";
    }
}
