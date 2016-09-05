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
public class Rectangle {
    double width;
    double length;
   public  Rectangle(double _width, double _length){
     this.width = _width;
     this.length = _length;
       

   }
    public void setLength(double l) {
        if(l>0)
       this.length = l;
    }
    public void setWidth(double w) {
        if(w>0)
       this.width = w;
        
    }
    public double RectangleArea(){
    
     return length*width; 
    
    }
}
