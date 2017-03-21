/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Bart.Stoebel
 */
public class MuisAdapter extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent event){
        JOptionPane.showMessageDialog(null, String.valueOf(event.getX()));
    }
    
}
