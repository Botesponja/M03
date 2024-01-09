/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author beta1501
 */
// Archivo: Deportivo.java
public class Deportivo extends Automovil {
    private boolean turbo;

    public Deportivo(String marca, int añoFabricacion, boolean turbo) {
        super(marca, añoFabricacion);
        this.turbo = turbo;
    }

    public void activarTurbo() {
        System.out.println("Turbo activado en el automóvil deportivo de la marca " + marca + ".");
    }
}

