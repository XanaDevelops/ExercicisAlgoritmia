/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici3.Figures;

/**
 *
 * @author daniel
 */
public class Triangle extends Figura { //equilatero
    
    private double b, h;
    
    public Triangle(double b){
        this.b  = b;
        this.h = calculateH(this.b);
        cArea();
        cPerimetro();
    }
    
    private double calculateH(double c){
       return Math.sqrt(c*c - (c*c/4));
    }

    @Override
    protected void cArea() {
        this.area=(this.b*this.h)/2d;
    }

    @Override
    protected void cPerimetro() {
        this.perimetro=3*b;
    }
    
}
