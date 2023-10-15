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

    private Persona[] pers;
    private Professor[] prof;
    private Estudiant[] estud;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercici5 ex5 = new Exercici5();
        ex5.pers = ex5.generadorPersones(N);
        ex5.separar();
        Arrays.sort(ex5.pers);
        Arrays.sort(ex5.prof);
        Arrays.sort(ex5.estud);

        System.out.println(Arrays.toString(ex5.pers));
        System.out.println(Arrays.toString(ex5.prof));
        System.out.println(Arrays.toString(ex5.estud));
    }

    private Persona[] generadorPersones(int n) {
        Persona[] pers = new Persona[n];

        for (int i = 0; i < n; i++) {
            pers[i] = genRandP();
        }

        return pers;
    }

    private Persona genRandP() {
        Random r = new Random();
        Persona p = null;
        switch (r.nextInt(3)) {
            case 0:
                p = new Persona("nom_" + r.nextInt(N * N), "adreça_" + r.nextInt(N * N));
                break;
            case 1:
                p = new Professor("nomP_" + r.nextInt(N * N), "adreça_" + r.nextInt(N * N),
                        Areas.values()[r.nextInt(Areas.values().length)], r.nextInt(9999999));
                break;
            case 2:
                p = new Estudiant("nomA_" + r.nextInt(N * N), "adreça_" + r.nextInt(N * N),
                        Programes.values()[r.nextInt(Programes.values().length)], r.nextInt(500), r.nextInt(999999));
                break;
        }
        return p;
    }

   
    private void separar() {
        int numEst = 0;
        int numProf = 0;
        for (int i = 0; i < N; i++) {
            if (pers[i] instanceof Estudiant) {
                numEst++;
            } else if (pers[i] instanceof Professor) {
                numProf++;
            }

        }
        this.prof = new Professor[numProf];
        this.estud = new Estudiant[numEst];
        numEst = 0;
        numProf = 0;
        for (int i = 0; i < N; i++) {
            if (pers[i] instanceof Estudiant) {
                estud[numEst] = (Estudiant) pers[i];
                numEst++;
            } else if (pers[i] instanceof Professor) {
                prof[numProf] = (Professor) pers[i];
                numProf++;
            }

        }

    }

}
