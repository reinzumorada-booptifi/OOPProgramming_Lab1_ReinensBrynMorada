/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_bryn;
import java.util.Arrays;
/**
 *
 * @author jenniferobach
 */
public class OOP_Bryn {
    public static void main(String[] args) {

        // Arithmetic
        ArithmeticOperations addOp = new ArithmeticOperations(10, 5, "add");
        System.out.println("Addition: " + addOp.compute());

        ArithmeticOperations divOp = new ArithmeticOperations(10, 2, "divide");
        System.out.println("Division: " + divOp.compute());

        // Geometry
        Circle circle = new Circle(7);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        // Number Analysis
        NumberAnalysis num = new NumberAnalysis(5);
        System.out.println("Is 7 prime? " + num.isPrime());
        System.out.println("5 factorial: " + num.factorial());
        System.out.println("Is 10 Non-prime? " + num.isEven());
        
        //The class hierarchy of this project is designed with MathematicalOperations as the base (parent) class. 
        //The child classes that inherit from it are ArithmeticOperations, GeometryOperations, and NumberAnalysis. 
        //All attributes in the system are declared as private to prevent direct external modification. 
        //This ensures that the data can only be changed through setter methods and accessed through getter methods, demonstrating proper use of encapsulation. 
        //Inheritance plays an important role in this design. Instead of each class managing its own data separately, the base class handles the storage and control of operands. 
        //The child classes simply retrieve the needed data using the getters provided by the parent class. This avoids redundancy, reduces possible errors, and promotes cleaner and more organized code structure. 
        //By using this approach, the program becomes more modular, maintainable, and easier to extend with new mathematical operations in the future without modifying existing classes.//
        
    }
}