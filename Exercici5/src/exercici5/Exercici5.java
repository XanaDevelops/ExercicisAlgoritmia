/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

import java.util.Arrays;
import java.util.Random;
import persones.Estudiant;
import persones.Estudiant.Programes;
import persones.Persona;
import persones.Professor;
import persones.Professor.Areas;

/**
 *
 * @author daniel
 */
public class Exercici5 {

    private static final int N = 10;  //CAMBIAR A 10^6!!!!
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercici5 ex5 = new Exercici5();
        Persona[] pers = ex5.generadorPersones(N);
        
        System.out.println(Arrays.toString(pers));
    }
    
    private Persona[] generadorPersones(int n){
        Persona[] p = new Persona[n];
        
        for(int i=0;i<n;i++){
            p[i] = genRandP();
        }
        
        return p;
    }
    
    private Persona genRandP(){
        Random r = new Random();
        Persona p = null;
        switch(r.nextInt(3)){
            case 0:
                p = new Persona("nom_"+r.nextInt(N*N),"adreça_"+r.nextInt(N*N));
                break;
            case 1:
                p = new Professor("nomP_"+r.nextInt(N*N), "adreça_"+r.nextInt(N*N),
                        Areas.values()[r.nextInt(Areas.values().length)], r.nextInt(9999999));
                break;
            case 2:
                p = new Estudiant("nomA_"+r.nextInt(N*N), "adreça_"+r.nextInt(N*N),
                        Programes.values()[r.nextInt(Programes.values().length)], r.nextInt(500), r.nextInt(999999));
                break;
        }
        return p;
    }
    
}
