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
public class simple_Factory_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();
        Document document = factory.open("bestandsnaam.docx");
        document.printPreview();
        
    }
    
}
