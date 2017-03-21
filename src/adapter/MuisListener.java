/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 * Omdat je de interface implementeert, moet je elke method overriden. Je hebt 
 * er echter maar 1 nodig: mouseClicked. 
 * In plaats daarvan kan je de MuisAdapter gebruiken, die erft van MouseAdapter!
 * @author Bart.Stoebel
 */
public class MuisListener implements MouseListener{

    
    @Override
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, String.valueOf(e.getX()));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
