/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import persones.Estudiant;
import persones.Estudiant.Programes;
import persones.Persona;
import persones.Professor;
import persones.Professor.Areas;

/**
 * Classe principal del Exercici 5
 *
 * @author daniel
 */
public class Exercici5 {

    private static final int N = 1000000;  //CAMBIAR A 10^6!!!!

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

        System.out.println("PERSONA");
        ex5.mostrarInvers(ex5.pers);
        System.out.println("PROFESSOR");
        ex5.mostrarInvers(ex5.prof);
        System.out.println("ESTUDIANT");
        ex5.mostrarInvers(ex5.estud);
        //ex5.mostrarInvers(ex5.prof);
//        Arrays.sort(ex5.pers);
//        Arrays.sort(ex5.prof);
//        Arrays.sort(ex5.estud);
//
//        System.out.println(Arrays.toString(ex5.pers));
//        System.out.println(Arrays.toString(ex5.prof));
//        System.out.println(Arrays.toString(ex5.estud));
    }

    /**
     * Mostra els 10 darrers elements del Array
     * P: Array Persona[] no null amb cap element null
     * Q: Els 10, o menys, elements primers ordenats inversament
     * 
     * @param arr Array de Persona
     * 
     */
    private void mostrarInvers(Persona[] arr) {
        Arrays.sort(arr, new ComparadorPersona().reversed());
        for (int i = 0; i < 10 && i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    private void mostrarInvers(Professor[] arr) {
        Arrays.sort(arr, new ComparadorProfessor().reversed());
        for (int i = 0; i < 10 && i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    private void mostrarInvers(Estudiant[] arr) {
        Arrays.sort(arr, new ComparadorEstudiant().reversed());
        for (int i = 0; i < 10 && i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * P: Enter {@code n>=0} de persones a generar Q: Array de mida n on tots
     * els elements son, o hereten, de Persona
     *
     * @param n Número de Persona a generar
     * @return Persona[] Array de Persona, Professor i Estudiant
     */
    private Persona[] generadorPersones(int n) {
        Persona[] pers = new Persona[n];

        for (int i = 0; i < n; i++) {
            pers[i] = genRandP();
        }

        return pers;
    }

    /**
     * Genera una Persona aleatoria
     *
     * @return Persona
     */
    private Persona genRandP() {
        Random r = new Random();
        Persona p = null;
        switch (r.nextInt(3)) {
            case 0 ->
                p = new Persona("nom_" + r.nextInt(N,N*10), "adreça_" + r.nextInt(N,N*10));
            case 1 ->
                p = new Professor("nom_" + r.nextInt(N,N*10), "adreça_" + r.nextInt(N,N*10),
                        Areas.values()[r.nextInt(Areas.values().length)], r.nextInt(N,N*10));
            case 2 ->
                p = new Estudiant("nom_" + r.nextInt(N,N*10), "adreça_" + r.nextInt(N,N*10),
                        Programes.values()[r.nextInt(Programes.values().length)], r.nextInt(500), r.nextInt(N,N*10));
        }
        return p;
    }

    /**
     * Separa Estudiant i Professor en diferents Arrays
     */
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

    private static class ComparadorPersona implements Comparator<Persona> {

        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.compareTo(o2);
        }
    }
    
    private static class ComparadorProfessor implements Comparator<Professor> {

        @Override
        public int compare(Professor o1, Professor o2) {
            return o1.compareTo(o2);
        }
    }
    
    private static class ComparadorEstudiant implements Comparator<Estudiant> {

        @Override
        public int compare(Estudiant o1, Estudiant o2) {
            return o1.compareTo(o2);
        }
    }

}
