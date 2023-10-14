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
        Informatica
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
        return "Estudiant{" + "programa=" + programa + ", curs=" + curs + ", quota=" + quota + '}';
    }

    @Override
    public int compareTo(Persona obj) {
        if (!(obj instanceof Estudiant)) {
            return super.compareTo(obj);
        }
        return 0;
    }

}
