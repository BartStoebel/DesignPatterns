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
public class DocumentFactory {
    public Document open (String bestandsnaam){
        String extensie = bestandsnaam.substring(bestandsnaam.length()-4);
        switch(extensie){
            case "docx": return new Tekst(bestandsnaam);
            case "xlsx": return new Rekenblad(bestandsnaam);
            case "pptx": return new Presentatie(bestandsnaam);
            default :    throw new IllegalArgumentException();
        }
    }
}
