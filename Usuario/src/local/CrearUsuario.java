
package local;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class CrearUsuario {
    
    private Scanner entrada = new Scanner(System.in);
    public Usuario crearUsuario(){
        Usuario usuario = new Usuario();
        System.out.println("Ingrese sus datos");
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Correo: ");
        String correo = entrada.nextLine();
        System.out.println("Contrasena: ");
        String contrasena =entrada.nextLine();
        
        return new Usuario(nombre, edad, correo, contrasena);
    }
}
