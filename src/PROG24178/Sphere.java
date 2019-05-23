
package PROG24178;

/**
 *
 * @author stuar
 */
public class Sphere extends Circle implements ThreeD{
    
    public Sphere() {}
    
    public Sphere(double radius){
        super(radius);
    }
    
    @Override 
    public double calcArea(){
        return 4 * Math.PI * getRadius()*getRadius();
    }
    
    @Override 
    public double getVolume(){
        return 4/3 * Math.PI * Math.pow(getRadius(),3);
    }
    

}

