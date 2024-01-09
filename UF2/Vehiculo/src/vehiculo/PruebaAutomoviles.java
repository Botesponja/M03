/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author beta1501
 */
// Archivo: PruebaAutomoviles.java
public class PruebaAutomoviles {
    public static void main(String[] args) {
        Automovil sedan = new Automovil("Toyota", 2022);
        sedan.arrancar();
        sedan.detener();

        Deportivo deportivo = new Deportivo("Ferrari", 2023, true);
        deportivo.arrancar();
        deportivo.detener();
        deportivo.activarTurbo();
    }
}

