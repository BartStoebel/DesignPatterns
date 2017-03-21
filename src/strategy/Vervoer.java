/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Bart.Stoebel
 */
public class Vervoer {
    public void doeEenOversteek(Vervoermiddel vervoermiddel){
        System.out.println("Inpakken");
        vervoermiddel.vervoer();
        System.out.println("Uitpakken");
    }    
}
