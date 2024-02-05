/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exempleherencia;

import java.util.ArrayList;

/**
 *
 * @author beta1501
 */
public class Professor extends Persona {
    private int Cod_Prof;
    private String departamento;
    private String modulos;
    private String horarios;

    public Professor(String nombre, String DNI, String direccion, int telefono, int Cod_Prof, String departamento) {
        super(nombre, DNI, direccion, telefono);
        this.Cod_Prof = Cod_Prof;
        this.departamento = departamento;
    }

    public int getCod_Prof() {
        return Cod_Prof;
    }

    public String getDepartamento() {
        return departamento;
    }

  
}

    
