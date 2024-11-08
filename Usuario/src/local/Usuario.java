
package local;

/**
 *
 * @author Daniel
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private String contrasena;

    public Usuario() {
    }
    
    public Usuario(String nombre, int edad, String correo, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public void mostrarInformacion(){
        System.out.println("nombre: " + nombre + 
                "\nedad: " + edad + 
                "\ncorreo: " + correo);
    }
}
