
package local;

/**
 *
 * @author Daniel
 */
public class CalcularPrecio {
    public double calcularPrecioFinal(Producto producto){
        double precioBase = producto.getPrecioBase();
        double impuesto = producto.getImpuesto();
        return precioBase + (precioBase * impuesto);
    }
}
