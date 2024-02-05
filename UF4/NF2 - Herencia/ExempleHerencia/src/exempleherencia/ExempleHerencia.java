/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exempleherencia;

/**
 *
 * @author beta1501
 */
public class ExempleHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona people = new Persona("Pepe", "232323", "lol", 123);
       Alumne student = new Alumne(1, "st", 1, 1, "ss", "23232","sdfsdf",1);
       Professor teacher = new Professor("lol", "DNI", "direccion", 0, 0, "departamento");
       
        System.out.println("Datos alumno: " 
        + student.getNombre() + ", " + student.getDNI() + ", " + student.getDireccion() + ", " + student.getCiclo() );
        
        System.out.println("Datos profe: " 
        + teacher.getNombre() + ", " + teacher.getDNI() + ", " + teacher.getDireccion() + ", " + teacher.getDepartamento());
        
       
    }
    
}
