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
public class SingletonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor.INSTANCE.start();
        stopDeAuto();
    }
    public static void stopDeAuto(){
        Motor.INSTANCE.stop(); 
    }
    
}
