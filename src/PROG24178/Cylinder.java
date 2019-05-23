
package PROG24178;

/**
 *
 * @author Stuart Bollinger
 */
public class Cylinder extends Circle implements ThreeD {
    
    private double height = 1;
    
    public Cylinder () {
        super();    //this is automatic if you don't call any super()           what does this mean ????
    }
        
    public Cylinder (double radius, double height){
        super(radius);          //must be first!!!
        setHeight(height);
    }
    
    public void setHeight(double height){
        if (height <= 0) {
            throw new IllegalArgumentException("Error: Height must be greater than 0");
        } else {
        this.height = height;
        }
    }
    
    public double getHeight(){
        return height;
    }
    
    @Override
    public double calcArea(){         
        return calcCircumference() * height + 2 * super.calcArea();
    }
    
    @Override
    public double getVolume(){
        return height * calcArea();
    }
    
  /*  @Override
    public String toString() {
        return String.format("%s height=%.1f", super.toString(), height);
    } */
    
    
    @Override
    public String toString() {
	return super.toString() + "    height=" + height;
}
    
    public boolean equals(Object obj){
        
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Cylinder){
        Cylinder that = (Cylinder)obj;
        return this.getRadius() == that.getRadius() && this.height == that.getHeight();
        }else{
            return false;
        }
    }
}

