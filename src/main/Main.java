/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import adapter.AdapterMain;
import composite.CompositeMain;
import decorator.DecoratorMain;
import facade.FacadeMain;
import observer.ObserverMain;
import simple_factory.simple_Factory_Main;

/**
 *
 * @author Bart.Stoebel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SingletonMain.main(args);
        //simple_Factory_Main.main(args);
        //BuilderMain.main(args);
        //FacadeMain.main(args);
        //AdapterMain.main(args);
        //CompositeMain.main(args);
        //DecoratorMain.main(args);
        //ObserverMain.main(args);
        strategy.strategyMain.main(args);
        
    }
    
}
