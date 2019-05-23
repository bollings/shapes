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
public class Rectangle extends Shape{
     
    private double width = 1;
    private double length = 1;
    
    Rectangle(){}
    
    Rectangle (double side){
        setWidth(side);
        setLength(side);
    }
    
    Rectangle(double length, double width){
        setWidth(width);
        setLength(length);
    }
    
    public void setWidth(double width){
        if (width <= 0) {
            throw new IllegalArgumentException("Error: Width must be greater than 0");
        } else {
        this.width = width;
        }
    }
    
    public double getWidth(){
        return width;
    }
     
    public void setLength(double length){
        if (length <= 0) {
            throw new IllegalArgumentException("Error: Length must be greater than 0");
        } else {
    }
        this.length = length;
    }
    
    public double getLength(){
        return length;
    }
    
    public double calcPerimiter() {
        return 2 * width + 2 * length;
    }
    
    @Override
    public double calcArea(){
        return width * length;
    }
    
    @Override
    public String toString(){
        return "Rectangle: length= " + length + " width=" + width; 
    }
}
