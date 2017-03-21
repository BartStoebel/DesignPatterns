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
public abstract class ArrangementDecorator implements Arrangement{

    protected final Arrangement gedecoreerdArrangement;

    public ArrangementDecorator(Arrangement gedecoreerdArrangement) {
        this.gedecoreerdArrangement = gedecoreerdArrangement;
    }
}
