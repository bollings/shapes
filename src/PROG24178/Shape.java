/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG24178;

/**
 *
 * @author stuar
 */
public abstract class Shape {
    
    public abstract double calcArea();
    
    public String toString() {
        return this.getClass().getSimpleName() + ": ";
    }
}