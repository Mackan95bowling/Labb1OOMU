/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author S143534
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangle Rec = new Rectangle(10,5); 
       Square Sqr = new Square(20);
       Circle Cir = new Circle(12);
      
        Rec.RectangleArea();
        Sqr.SquareArea();  
        Cir.CircleArea();
        
        System.out.println("AreaRectangle: "+Rec.RectangleArea()+" AreaSquare: "+Sqr.SquareArea()+" AreaCircle: "+Cir.CircleArea());
    }
    
}
