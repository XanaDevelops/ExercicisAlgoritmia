/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

/**
 *
 * @author daniel
 */
public class Estudiant extends Persona {

    protected Programes programa;
    protected int curs, quota;

    public enum Programes {
        Informatica, Tecnologia
    }

    public Estudiant(String nom, String adress, Programes programa, int curs, int quota) {
        super(nom, adress);
        this.programa = programa;
        this.curs = curs;
        this.quota = quota;
    }

    public Programes getPrograma() {
        return programa;
    }

    public void setPrograma(Programes programa) {
        this.programa = programa;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "Estudiant{" + "nom=" + nom + ", adress=" + adress + ", programa=" + programa + ", curs=" + curs + ", quota=" + quota + '}';
    }

    @Override
    public int compareTo(Persona obj) {
        if (!(obj instanceof Estudiant)) {
            return super.compareTo(obj);
        }
        Estudiant objE = (Estudiant)obj;
        if (this.programa.equals(objE.programa)) {
            return this.nom.compareTo(objE.getNom());
        } else {
            return this.programa.toString().compareTo(objE.getPrograma().toString());
        }
    }

}
