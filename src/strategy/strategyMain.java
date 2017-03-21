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
public class strategyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vervoer vervoer = new Vervoer();
        vervoer.doeEenOversteek(() -> System.out.println("Schaatsen over het ijs"));
        System.out.println();
        vervoer.doeEenOversteek(() -> System.out.println("Zeilen over het meer"));
    }
    
}
