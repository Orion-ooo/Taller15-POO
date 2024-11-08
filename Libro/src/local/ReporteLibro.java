
package local;

/**
 *
 * @author Daniel
 */
public class ReporteLibro {
    public String generarReporteLibro(Libro libro){
        return "Titulo: " + libro.getNombre() + "\nAutor: " + libro.getAutor() + 
                "\nAño de publicacion: " + libro.getAnoPublicacion();
    }
}
