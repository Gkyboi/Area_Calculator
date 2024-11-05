/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculator;

/**
 *
 * @author ASUS
 */
public class Triangle extends Shape{

    public Triangle(int A, int B) {
        super(A, B);
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of the rectangle is: " + (A*B)/2);
    }

    
    
}
