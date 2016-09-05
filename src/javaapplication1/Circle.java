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
public class Circle {
    double radius,Pi;
    
     Circle(double _radius){
    this.Pi = 3.14;
    this.radius = _radius;
    }
    public void setRadius(double R){
    if(R>0)
        this.radius = R;
    
    }
    public double CircleArea(){
        return radius*radius*Pi;
    
    }
}
