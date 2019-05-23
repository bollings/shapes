
package PROG24178;

import java.util.Scanner;

public class TestShapes {
     public static void main(String[] args) {
         
         Rectangle r1 = new Rectangle(5);
         System.out.println(r1);
         
        Sphere sphere1 = new Sphere(10);
        System.out.println("The area of sphere1 is: " + sphere1.calcArea());
              
        //This is implicit casting
        Circle roundShape1 = new Cylinder(1,1);
        System.out.println(roundShape1); 
        
        //Example of object implementing displayshape method for object that is NOT instance of cylinder
        Circle c1 = new Circle(1.5);
        displayShape(c1);
        
        //This is explicit casting 
        Circle roundShape = new Cylinder (2,2);
        displayShape(roundShape);
        Cylinder can = (Cylinder)roundShape;
        System.out.println(can);  
     }
     
     public static void displayShape(Circle shape) {
        
        System.out.println(shape);
        System.out.println("Area: " + shape.calcArea());
        if (shape instanceof Cylinder) {
            Cylinder temp = (Cylinder)shape;
            System.out.println("shape is instance of cylinder so, Volume: " + temp.getVolume());
         }
     }
}

    /*Object someShape = [circle or cylinder constructor];
        Class shapeClass = someShape.getClass();
        String className = shapeClass.getName();

        //same as
        String className = someShape.getClass().getSimpleName();*/

 /*
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("cylinder1 surface area is " + cylinder1.calcArea() 
               + " and volume is " + cylinder1.calcVolume());
                
        
        Cylinder cylinder2 = new Cylinder(2,2);
        System.out.println(cylinder2);
        System.out.println("cylinder2 surface area is " + cylinder2.calcArea() 
                + " and volume is " + cylinder2.calcVolume());
        boolean isLegitDimensions = false;
      
        System.out.print("Enter your cylinders radius: ");
        Scanner input = new Scanner(System.in);
        double  radius = input.nextDouble();
        System.out.print("Enter your cylinder height: ");
        double height = input.nextDouble();
        Cylinder cylinder3 = new Cylinder(radius, height);
        System.out.println(cylinder3 + "\ncylinder3 surface area is " + cylinder3.calcArea() 
                + " and volume is " + cylinder3.calcVolume());
        isLegitDimensions = true;
          
        cylinder3.setRadius(4);
        cylinder3.setHeight(4);
        System.out.println("Using the setRadius and setHeight methods,\ncylinder3 radius has been changed to " + cylinder3.getRadius() 
                + "\ncylinder3 height has been changed to " + cylinder3.getHeight());
   */




//This works, implicit cast of cylinder into circle      
        /*
        Circle roundShape = new Cylinder(1,2);
        System.out.println(roundShape); */
    
//Compile error, cannot place parent circle into child cylinder
        /*Cylinder can = new Circle(2);
        System.out.println(can); */
         

//Compile error. Cannot implicit cast circle variable into cylinder
        /*Circle roundShape = new Cylinder(1,2);
        System.out.println(roundShape);
        Cylinder can = roundshape;
        System.out.println(can)*/

//This works, explicit casting, since object was cylinder to begin with
        /*Circle roundShape = new Cylinder(1,2);
         System.out.println(roundShape);
         Cylinder can = (Cylinder)roundShape;
         System.out.println(can); */   

