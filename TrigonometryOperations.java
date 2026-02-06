/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_bryn;

/**
 *
 * @author jenniferobach
 */
public class TrigonometryOperations extends MathOperation {

    double[] ops = getOperands();

    public TrigonometryOperations(double input1, double input2) {
        super(input1, input2);
    }
    
    public double calculate() {
        // default behavior (not used much here)
        return 0;
    }
    
    // The purpose of initializing ops is to take all the operands that are needed to answer each trigonometry problem. 

    private double[] getOperands() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double compute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}