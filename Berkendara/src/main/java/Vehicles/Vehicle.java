/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;

/**
 *
 * @author acer
 */
public abstract class Vehicle {
    public String brandName;
    private String serialNumber;
    protected int tankCapacity;
    
    public Vehicle(String brandName, String serialNumber, int tankCapacity){
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.tankCapacity = tankCapacity;
    }
    
    public String getSerialNumber(){
        return this.serialNumber;
    }
    
    public void checkingForTankCapacity(){
        System.out.println("This vehicle has " + tankCapacity + "L of tank capacity");
    }
    
    public abstract void turnMachineOn();
    public abstract void horn();
}
