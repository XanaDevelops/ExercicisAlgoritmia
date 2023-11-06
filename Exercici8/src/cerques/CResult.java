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

    public CResult(int result, int access) {
        this.result = result;
        this.access = access;
    }

    public void update(int result, int access){
        this.result = result;
        this.access = access;
    }
    
    public void addAccess(){
        this.access+=1;
    }
    
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "CResult{" + "result=" + result + ", access=" + access + '}';
    }
    
    
}
