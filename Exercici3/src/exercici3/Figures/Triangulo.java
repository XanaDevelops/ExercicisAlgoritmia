/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici3.Figures;

/**
 *
 * @author daniel
 */
public class Triangulo extends Figura { //equilatero
    
    private double b, h;
    
    public Triangulo(double b){
        this.b  = b;
        this.h = calculateH();
    }
    
    private double calculateH(){
        return 0;
    }

    @Override
    public void cArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cPerimetro() {
        this.perimetro=3*b;
    }
    
}
