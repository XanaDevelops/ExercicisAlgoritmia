/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

/**
 * Classe que representa un Estudiant
 * 
 * @see Persona
 * @author daniel
 */
public class Estudiant extends Persona {

    /**
     *Aquesta variable es un Enum que conte la carrera que cursa el estudiant
     */
    protected Programes programa;

    /**
     *Aquesta variable es un int que conte el curs en el qual es troba el estudiant 
     */
    protected int curs;

    /**
     *Aquesta variable es un int que conte la quantitad de doblers de la quota que paga per cursar el curs
     */
    protected int quota;

    /**
     * Programes dels Estudiants
     */
    public enum Programes {

        /**
         *
         */
        Informatica,

        /**
         *
         */
        Tecnologia,
        /**
         * 
         */
        Matematiques
    }

    /**
     *Metode constructor de la classe Estudiant
     * @param nom aquest parametre s'introdueix per indicar el nom del estudiant
     * @param adress aquest  parametre s'introdueix per indicar l'adreça de la casa del estudiant 
     * @param programa aquest parametre s'introdueix per indicar el programa que cursa el alumne
     * @param curs aquest parametre s'introdueix per indicar el curs en el qual es troba el alumne 
     * @param quota aquest parametre s'intodueix per indicar quant paga de quota el alumne
     */
    public Estudiant(String nom, String adress, Programes programa, int curs, int quota) {
        super(nom, adress);
        this.programa = programa;
        this.curs = curs;
        this.quota = quota;
    }

   /**
     * Aquest metode serveix per retornar el valor del parametre programa 
     * @return programa
     */
    public Programes getPrograma() {
        return programa;
    }

    /**
     *Aquest metode serveix per modificar el perametre programa
     * @param programa aquest perametre es un Enum que s'asigna el parametre  programa
     */
    public void setPrograma(Programes programa) {
        this.programa = programa;
    }

   /**
     * Aquest metode serveix per retornar el valor del parametre curs 
     * @return int , curs 
     */
    public int getCurs() {
        return curs;
    }

    /**
     *Aquest metode serveix per modificar el parametre curs
     * @param curs aquest parametre es un int que s'asigna el perametre curs
     */
    public void setCurs(int curs) {
        this.curs = curs;
    }

    /**
     * Aquest metode serveix per retornar el valor del parametre quota
     * @return int quota 
     */
    public int getQuota() {
        return quota;
    }

    /**
     *Aquest metode serveix per modificar el perametre quota
     * @param quota aquest perametre es un int que s'asigna el perametre quota
     */
    public void setQuota(int quota) {
        this.quota = quota;
    }

    /**
     *Aquest metode retorna un string amb el nom,adressa,programa,curs i quota de la persona
     * @return String
     */
    @Override
    public String toString() {
        return "Estudiant{" + "nom=" + nom + ", adress=" + adress + ", programa=" + programa + ", curs=" + curs + ", quota=" + quota + '}';
    }

  /**
     *Aquest metode serveix per comparar dos objectes de la classe estudiant
     * @param obj perametre de classe Persona que es comparara amb l'objecte del cual es crida aquest metode
     * @return int aquest parametre  retorna 1 si el objecte que crida el metode es major,0 si son iguals y -1 si és mes petit
     */ 
    public int compareTo(Estudiant obj) {
        if (this.programa.equals(obj.programa)) {
            return this.nom.compareTo(obj.getNom());
        } else {
            return this.programa.toString().compareTo(obj.getPrograma().toString());
        }
    }

}
