/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjectsex;

/**
 *
 * @author Mark
 */
public class Car {
    String make;
    String model;
    int numWheels;
    String colour;

    public Car(String make, String model, int numWheels, String color) {
        this.make = make;
        this.model = model;
        this.numWheels = numWheels;
        this.colour = color;
    }
    

    
    
    public void drive(double direction) {
    System.out.println(String.format("The %s %s is driving at %.0f degrees", colour, make, direction));    
    
    
    } 

}
