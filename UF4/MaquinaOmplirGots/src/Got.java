/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Benjamin
 */
public class Got {
    //atributs i material
   private int capacity;
   private int liquid; //liquid dins de la botella
    private String material;

    public Got() {
        this.capacity = 250;
        this.liquid = 0;
        this.material = "Plastico";
    }

    public Got(int capacity) {
        this.capacity = capacity;
        this.liquid = 0;
        this.material = "Plastico";
    }

    public Got(int capacity, int liquid) {
        this.capacity = capacity;
        this.liquid = liquid;
        this.material = "Plastico";
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLiquid() {
        return liquid;
    }

    public void setLiquid(int liquid) {
        this.liquid = liquid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
    
}
