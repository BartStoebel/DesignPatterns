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
public class Rekenblad extends Document{
     
    public Rekenblad(String bestandsnaam){
        super(bestandsnaam);
    }

    @Override
    public void print() {
        System.out.println("een afdruk van het Rekenblad");
    }

    @Override
    public void printPreview() {
        System.out.println("een voorbeeldafdruk van het Rekenblad");
    }
}
