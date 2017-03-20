/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Bart.Stoebel
 */
public class CDPlayer implements Geluidsbron{
    private boolean laatstGestart;
    private boolean speelt;
    
    @Override
    public void start(){
        setLaatstGestart(true);
        setSpeelt(true);
        System.out.println("Cd speler gestart met spelen.");
    }
    @Override
    public void stop(){
        //setLaatstGestart();
        setSpeelt(false);
        System.out.println("Cd speler gestopt met spelen.");
    }

    public boolean isLaatstGestart() {
        return laatstGestart;
    }

    public void setLaatstGestart(boolean laatstGestart) {
        this.laatstGestart = laatstGestart;
    }

    public boolean isSpeelt() {
        return speelt;
    }

    public void setSpeelt(boolean speelt) {
        this.speelt = speelt;
    }
    
    
}
