/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exempleherencia;

/**
 *
 * @author beta1501
 */
public class Persona {
    protected String nombre; //privada excepto para clases hijas
    protected String DNI;
    private String direccion; // puede ser privada si la clase hija no la utiliza
    private int telefono;

    public Persona(String nombre, String DNI, String direccion, int telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
