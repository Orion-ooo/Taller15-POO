
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        Libro libro = new Libro("Bajo la misma estrella", "Jonh Green", 2012);
        ReporteLibro generadorReporte = new ReporteLibro();
        PersistenciaLibro persistencia = new PersistenciaLibro();

        //reporte
        String reporte = generadorReporte.generarReporteLibro(libro);
        
        //guardar
        persistencia.guardarLibro(libro, reporte);
    }
    
}
