/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_bryn;

/**
 *
 * @author jenniferobach
 */
// Arithmetic operations module
public class ArithmeticOperations extends MathOperation {

    private String operationType; // e.g., "add", "subtract"

    public ArithmeticOperations(double input1, double input2, String operationType) {
        super(input1, input2);
        this.operationType = operationType;
    }

    public String getOperationType() { return operationType; }
    public void setOperationType(String operationType) { this.operationType = operationType; }

    // Override the abstract method from parent
    @Override
    public double compute() {
        switch (operationType.toLowerCase()) {
            case "add": return getInput1() + getInput2();
            case "subtract": return getInput1() - getInput2();
            case "multiply": return getInput1() * getInput2();
            case "divide":
                if (getInput2() == 0) throw new IllegalArgumentException("Cannot divide by zero!");
                return getInput1() / getInput2();
            default: throw new IllegalArgumentException("Invalid arithmetic operation!");
        }
    }
}