/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Vervang de MuisListener (die de interface implementeert, en dus te veel methods
 * bevat die we niet nodig hebben) door de MuisAdapter (die je toelaat enkel de 
 * methods te overriden die je nogig hebt!
 * 
 * @author Bart.Stoebel
 */
public class Frame extends JFrame{
    private static final long serialVersionUID = 1L;
    
    public Frame (){
        super("Eerste venster");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button = new JButton("tekst");
        //button.addMouseListener(new MuisListener());
        button.addMouseListener(new MuisAdapter());
        add(button);
    }
}
