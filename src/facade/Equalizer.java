/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Bart.Stoebel
 */
public class Equalizer {
    private boolean speelt;
    public void start(){
        System.out.println("Equalizer is gestart");
    }
    public void stop(){
        System.out.println("Equalizer is gestopt");
    }

    public boolean isSpeelt() {
        return speelt;
    }

    public void setSpeelt(boolean speelt) {
        this.speelt = speelt;
    }
    
}
