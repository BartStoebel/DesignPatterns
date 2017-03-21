/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Bart.Stoebel
 */
public class MetFietsen extends ArrangementDecorator{

    public MetFietsen(Arrangement gedecoreerdArrangement) {
        super(gedecoreerdArrangement);
    }

    @Override
    public String getTaken() {
        return super.gedecoreerdArrangement.getTaken() + "Zet de fietsen aan de bungalow\n";
    }
    
}
