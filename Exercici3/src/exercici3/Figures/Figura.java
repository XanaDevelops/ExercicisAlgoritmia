/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici3.Figures;

/**
 *
 * @author daniel
 */
public abstract class Figura {
    protected double area;
    protected double perimetro;
    
    /**
     * genera area
     */
    protected abstract void cArea();
    /**
     * genera perimetre
     */
    protected abstract void cPerimetro();

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+" Area:" +area+ " Perimetre:"+perimetro;
    }
}
