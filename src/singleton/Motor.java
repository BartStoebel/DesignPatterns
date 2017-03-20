/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Bart.Stoebel
 */
public enum Motor {
    INSTANCE;
    
    private boolean gestart; 
    public void start(){
        gestart = true;
        System.out.println("gestart");
    }
    public void stop(){
        gestart = false;
        System.out.println("gestopt");
    }
}
