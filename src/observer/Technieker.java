/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Bart.Stoebel
 */
public class Technieker implements Observer{
    private String nummer;

    public Technieker(String nummer) {
        this.nummer = nummer;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if(!(o instanceof FotokopieMachine)){
            throw new IllegalArgumentException();
        }
        FotokopieMachine fotokopieMachine = (FotokopieMachine)o;
        System.out.println(nummer + " plant het onderhoud voor volgende week.");
    }
}
