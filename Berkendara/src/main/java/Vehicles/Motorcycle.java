/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;

/**
 *
 * @author acer
 */
public class Motorcycle extends Vehicle{
    public Motorcycle(String brandName, String serialNumber, int tankCapacity) {
        super(brandName, serialNumber, tankCapacity);
    }
    
    @Override
    public void turnMachineOn() {
        System.out.println("This motorcycle is ready for a ride!");
    }
    
    @Override
    public void horn() {
        System.out.println("Tin tin!!");
    }
    
}
