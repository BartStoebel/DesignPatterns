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
public abstract class Document {
    private final String bestandsnaam;
    
    public Document (String bestandsnaam){
        this.bestandsnaam = bestandsnaam;
    }
    public abstract void print();
    public abstract void printPreview();
}
