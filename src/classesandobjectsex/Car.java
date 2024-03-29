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
    
    public Car() {
        make = "Honda";
        model = "Civic";
        numWheels = 4;
        colour = "yellow";
    }
    
    public Car(String make, String model, int numWheels, String colour) {
        this.make = make;
        this.model = model;
        this.numWheels = numWheels;
        this.colour = colour;
    }
    
    

    public void drive(double direction) {
    System.out.println(String.format("The %s %s is driving at %f degrees", colour, make, direction));    
    
    }
    public void drive(String direction) {
        System.out.println("The " + colour + " " + make + " " + numWheels + " " +direction);
   
    } 

}
