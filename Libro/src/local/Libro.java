
package local;

/**
 *
 * @author Daniel
 */
public class Libro {
    private String nombre;
    private String autor;
    private int anoPublicacion;

    public Libro(String nombre, String autor, int anoPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    
}
