/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

/**
 *
 * @author daniel
 */
public class Persona implements Comparable<Persona> {

    /**
     *Aquesta variable conte el nom de la persona
     */
    protected String nom;

    /**
     *Aquesta variable conte l'adressa de la casa de la persona
     */
    protected String adress;

    /**
     *Metode constructor de la Classe persona
     * @param nom aquest parametre introdueix el nom de la persona
     * @param adress aquest perametre introdueix la adressa de la casa de la persona
     */
    public Persona(String nom, String adress) {
        this.nom = nom;
        this.adress = adress;
    }

   
    /**
     * Aquest metode serveix per retornar el valor del parametre Nom
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     *Aquest metode serveix per modificar el perametre nom
     * @param nom aquest perametre es un String que s'asigna el parametre nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    /**
     * Aquest metode serveix per retornar el valor del parametre adress 
     * @return adress
     */
    public String getAdress() {
        return adress;
    }

     /**
     *Aquest metode serveix per modificar el perametre adress
     * @param adress aquest perametre es un String que s'asigna el perametre adress 
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     *Aquest metode retorna un string amb el nom i adressa de la persona
     * @return String
     */
    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", adress=" + adress + '}';
    }

     /**
     *Aquest metode serveix per comparar dos objectes de la classe Persona
     * @param o parametre de classe Persona que es comparara amb l'objecte del qual es crida aquest metode
     * @return int aquest parametre  retorna 1 si el objecte que crida el metode es major,0 si son iguals y -1 si es mes petit
     */
    @Override
    public int compareTo(Persona o) {
        return this.getNom().compareTo(o.getNom());
    }

    /**
     *Aquest metode ens diu si dos objectes de la classe Persona son iguals
     * @param obj parametre de classe Persona ques es compara amb l'objecte del qual es es crida aquest 
     * @return boolean que es vertader si el objectes son iguals
     */
    public boolean equals(Persona obj) {
        return this.compareTo(obj) == 0; 
    }

}
