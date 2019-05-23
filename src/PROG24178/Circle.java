
package PROG24178;

/**
 *
 * @author Stuart Bollinger
 */
public class Circle extends Shape{ 

    private double radius = 1;
    
    Circle() {}
    
    Circle(double radius) {
        setRadius(radius);
    }
    
    public void setRadius(double radius) {
              
        if (radius <= 0){
            throw new IllegalArgumentException("Error: Radius must be greater than 0. ");
        }
        else{
            this.radius = radius; 
        }
    }

    public double getRadius() {
        return radius;
    }
    
    @Override
    public double calcArea() {
        return radius * radius * Math.PI;
    }
    
    public double calcCircumference() {
        return 2 * radius * Math.PI;
    }
    
    public String toString(){
        return this.getClass().getSimpleName() + ": radius=" + radius;
    }
    
    public boolean equals (Object c) {
        
        Circle circle = (Circle) c; 
        return this.radius == circle.getRadius();
    }
}

