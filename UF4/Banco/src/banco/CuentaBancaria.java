/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public abstract class CuentaBancaria {
    
    private String numeroCuenta;
    private int saldo;
    private final double interes_anual_basico = 3.25;

    public CuentaBancaria(String numeroCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public int ingresar(int dinero){
        Scanner sc = new Scanner(System.in);
        dinero = sc.nextInt();
        if(dinero <=0){
            return 0;
        }
        añadir();
        return dinero;
        
        
    }
    
    public int retirar(int dinero){
        
        Scanner sc = new Scanner(System.in);
        dinero = sc.nextInt();
        if (saldo <= 0){
            return 0;
        }
        añadir();
        return dinero;
    }
    
    private void añadir(){
        
        this.saldo += ingresar(saldo);
        this.saldo -= retirar(saldo);
        
        
    }
    
    public int traspaso(int dinero){
        
        Scanner sc = new Scanner(System.in);
        dinero = sc.nextInt();
        return dinero;
        
        
    }
}
