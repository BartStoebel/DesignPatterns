/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Bart.Stoebel
 */
public class ObserverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FotokopieMachine foto = new FotokopieMachine();
        
        Technieker t = new Technieker("1");
        Technieker t1 = new Technieker("2");
        Technieker t2 = new Technieker("3");
        foto.addObserver(t);
        foto.addObserver(t1);
        foto.addObserver(t2);
        foto.neemKopie(1003);

        foto.deleteObserver(t1);
        foto.deleteObserver(t2);
        System.err.println("");
        foto.neemKopie(1003);        
        
    }
        
        
        
}
