/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author Bart.Stoebel
 */
public class FotokopieMachine extends Observable{
    private int aantalKopies = 0;
    private final int onderhoudsInterval = 1000;

    public FotokopieMachine() {
        super();
    }
    
    public void neemKopie(int aantal){
        for (int i = 0; i<aantal; i++){
            aantalKopies++;
            if (aantalKopies%onderhoudsInterval == 0){
                setChanged();
                notifyObservers();
            }
        }
    }
}
