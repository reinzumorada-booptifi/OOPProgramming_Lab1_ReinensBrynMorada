/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_bryn;

/**
 *
 * @author jenniferobach
 */
// Number-based computations
public class NumberAnalysis {

    private int number;

    public NumberAnalysis(int number) {
        this.number = number;
    }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public long factorial() {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }
}