/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.Scanner;

/**
 *
 * @author Bart.Stoebel
 */
public class DecoratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arrangement arrangement = new Bungalow();
        try (Scanner scanner  = new Scanner(System.in)){
            System.out.print("Barbeque (j/n):");
            if (scanner.nextLine().equals("j")){
                arrangement= new MetBarbeque(arrangement) ;
            }
            System.out.print("Fietsen (j/n):");
            if (scanner.nextLine().equals("j")){
                arrangement = new MetFietsen(arrangement);
            }
            System.out.println(arrangement.getTaken());
        }
            
    }
    
}
