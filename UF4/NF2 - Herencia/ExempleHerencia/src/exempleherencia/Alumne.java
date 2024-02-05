/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exempleherencia;

/**
 *
 * @author beta1501
 */
public class Alumne extends Persona {
    private int num_expediente;
    private String ciclo;
    private int curso;
    private int nota_media;
    
    public Alumne(int num_expediente, String ciclo, int curso, int nota_media, String nombre, String DNI, String direccion, int telefono) {
        super(nombre, DNI, direccion, telefono);
        this.num_expediente = num_expediente;
        this.ciclo = ciclo;
        this.curso = curso;
        this.nota_media = nota_media;
    }

    public int getNum_expediente() {
        return num_expediente;
    }

    public String getCiclo() {
        return ciclo;
    }

    public int getCurso() {
        return curso;
    }

    public int getNota_media() {
        return nota_media;
    }

    public void codificarDNI(){
        String ultimos_digitos = this.DNI.substring(this.DNI.length()-2);
        
        String ultimos_digitos2 = this.getDNI().substring(this.DNI.length()-2);
        
    }
  
 }
