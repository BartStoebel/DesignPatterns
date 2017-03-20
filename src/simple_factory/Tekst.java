/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_factory;

/**
 *
 * @author Bart.Stoebel
 */
public class Tekst extends Document{
    
    public Tekst(String bestandsnaam){
        super(bestandsnaam);
    }

    @Override
    public void print() {
        System.out.println("een afdruk van deze tekst");
    }

    @Override
    public void printPreview() {
        System.out.println("een voorbeeldafdruk van deze tekst");
    }
}
