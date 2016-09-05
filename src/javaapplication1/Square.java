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
public class Square {
    double length;
    Square(double _length){
        this.length = _length;
    
    }
    
    public void setLength(double l){
     if(1>0)
     this.length=l;
}
    public double SquareArea(){
    
        return length*length;
    }
}