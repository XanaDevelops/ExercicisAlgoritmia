/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

/**
 *
 * @author daniel
 */
enum Areas{
    Area1
}
public class Professor extends Persona {
    protected Areas area;
    protected int sou;

    public Professor(Areas area, int sou, String nom, String adress) {
        super(nom, adress);
        this.area = area;
        this.sou = sou;
    }

    public Areas getArea() {
        return area;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }

    @Override
    public String toString() {
        return "Professor{" + "area=" + area + ", sou=" + sou + '}';
    }
    
    @Override
    public int compareTo(Persona obj){
        if(!(obj instanceof Professor)){
            return super.compareTo(obj);
        }
        return 0;  
    }
}
