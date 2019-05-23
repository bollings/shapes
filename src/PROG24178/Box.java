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
public class Box extends Rectangle implements ThreeD{
    
    private double height = 1;
    
    Box(){}
    
    Box(double side){     
        setHeight(side);
        setWidth(side);
        setLength(side);
    }
    
    Box(double height, double width, double length){
        setHeight(height);
        setWidth(width);
        setLength(length);
    }
    
    public void setHeight(double height){
        if (height <= 0){
            throw new IllegalArgumentException("Error: Height must be greater than 0");
        }else {
            this.height = height;
        }
    }
    
    public double getHeight(){
        return height;
    }
    
    @Override
    public double getVolume(){
        return height * getWidth() * getLength();
    }
    
    @Override
    public String toString(){
        return "Box: length= " + getLength() + " width= " + getWidth() + " height=" + height;
    }
}
