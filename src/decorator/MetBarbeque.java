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
public class MetBarbeque extends ArrangementDecorator{

    public MetBarbeque(Arrangement gedecoreerdArrangement) {
        super(gedecoreerdArrangement);
    }

    @Override
    public String getTaken() {
        return super.gedecoreerdArrangement.getTaken() + "Plaats de barbeque \n";
    }
    
}
