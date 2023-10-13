/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

/**
 *
 * @author daniel
 */
public class Persona implements Comparable<Persona>{
    protected String nom;
    protected String adress;

    public Persona(String nom, String adress) {
        this.nom = nom;
        this.adress = adress;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", adress=" + adress + '}';
    }

    @Override
    public int compareTo(Persona o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean equals(Persona obj) {
        return false; //TODO
    }
    
    
    
    
}
