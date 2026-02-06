/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_bryn;

/**
 *
 * @author jenniferobach
 */
// Base class for all mathematical operations
public abstract class MathOperation {

    // Encapsulated input values
    private double input1;
    private double input2;

    // Constructor
    public MathOperation(double input1, double input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    // Getters and setters (encapsulation)
    public double getInput1() { return input1; }
    public void setInput1(double input1) { this.input1 = input1; }

    public double getInput2() { return input2; }
    public void setInput2(double input2) { this.input2 = input2; }

    // Abstract method to perform calculation
    public abstract double compute();
}