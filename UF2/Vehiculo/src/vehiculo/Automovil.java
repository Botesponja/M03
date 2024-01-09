/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author beta1501
 */
// Archivo: Automovil.java
public class Automovil implements Vehiculo {
    String marca;
    protected int añoFabricacion;

    public Automovil(String marca, int añoFabricacion) {
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public void arrancar() {
        System.out.println("El automóvil de la marca " + marca + " ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El automóvil de la marca " + marca + " se ha detenido.");
    }

    private void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del automóvil.");
    }
}

