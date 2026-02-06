/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_bryn;

/**
 *
 * @author jenniferobach
 */
// Abstract base class for shapes
abstract class Shape {

    private double dimension1;
    private double dimension2;

    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double getDimension1() { return dimension1; }
    public void setDimension1(double dimension1) { this.dimension1 = dimension1; }

    public double getDimension2() { return dimension2; }
    public void setDimension2(double dimension2) { this.dimension2 = dimension2; }

    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0);
    }

    @Override
    public double area() {
        return Math.PI * getDimension1() * getDimension1();
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getDimension1();
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return getDimension1() * getDimension2();
    }

    @Override
    public double perimeter() {
        return 2 * (getDimension1() + getDimension2());
    }
}