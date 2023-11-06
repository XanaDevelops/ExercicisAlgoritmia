/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cerques;

/**
 *
 * @author danie
 */
public class CResult {
    private int result, access;

    /**
     * Classe auxiliar per emmagatzemar el nombre d'iteracions
     * @param result resultat operació
     * @param access nombre accessos als elements
     */
    public CResult(int result, int access) {
        this.result = result;
        this.access = access;
    }

    /**
     *
     * @param result
     * @param access
     */
    public void update(int result, int access){
        this.result = result;
        this.access = access;
    }
    
    /**
     *
     */
    public void addAccess(){
        this.access+=1;
    }
    
    /**
     *
     * @return
     */
    public int getResult() {
        return result;
    }

    /**
     *
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     *
     * @return
     */
    public int getAccess() {
        return access;
    }

    /**
     *
     * @param access
     */
    public void setAccess(int access) {
        this.access = access;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "CResult{" + "result=" + result + ", access=" + access + '}';
    }
    
    
}
