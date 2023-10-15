/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

/**
 * Classe que representa un Professor
 * 
 * @see Persona
 * @author daniel
 */
public class Professor extends Persona {

    /**
     * Arees dels Professors
     */
    public enum Areas {

        /**
         *
         */
        Area1,
        
        /**
         *
         */
        Area2,
        
        /**
         *
         */
        Area3
    }

    /**
     *Aquesta variable es un enum que conte l'area en la qual treballa el professor
     */
    protected Areas area;

    /**
     *Aquesta variable conte el sou que cobra el professor determinat
     */
    protected int sou;

    /**
     *Metode constructor de la classe professor
     * @param nom aquest parametre s'introdueix per indicar el nom del professor
     * @param adress aquest parametre s'introdueix per indicar la adressa del professor
     * @param area aquest parametre permeteix indicar l'area que ensenya aquest professor
     * @param sou  aquest parametre permeteix indicar el sou que cobra el professor 
     */
    public Professor(String nom, String adress, Areas area, int sou) {
        super(nom, adress);
        this.area = area;
        this.sou = sou;
    }

    /**
     * Aquest metode serveix per retornar el valor del parametre area 
     * @return area
     */
    public Areas getArea() {
        return area;
    }

    /**
     *Aquest metode serveix per modificar el perametre area 
     * @param area aquest perametre es un Enum de tipus area que s'asigna el perametre area 
     */
    public void setArea(Areas area) {
        this.area = area;
    }

    /**
     *Aquest metode retorna el valor del perametre sou
     * @return int
     */
    public int getSou() {
        return sou;
    }

    /**
     *Aquest metode serveix per modificar el perametre sou
     * @param sou aquest perametre es un int que s'asigna el perametre sou 
     */
    public void setSou(int sou) {
        this.sou = sou;
    }

    /**
     *Aquest metode retorna un String que conte el valor del nom,adressa,area i sou
     * @return String
     */
    @Override
    public String toString() {
        return "Professor{" + "nom=" + nom + ", adress=" + adress + ", area=" + area + ", sou=" + sou + '}';
    }

    /**
     *Aquest metode serveix per comparar dos objectes de la classe professor
     * @param obj perametre de classe Persone que es comparara amb l'objecte del cual es crida aques metode
     * @return int aquest perametre de retorna 1 si el objecte que crida el metode es major,0 si son iguals y -1 ai es mes petit
     */
    public int compareTo(Professor obj) {
        if (this.area.equals(obj.area)) {
            return this.nom.compareTo(obj.nom);
        } else {
            return this.area.toString().compareTo(obj.getArea().toString());
        }
    }
}
