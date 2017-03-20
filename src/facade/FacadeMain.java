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
public class FacadeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StereoketenFacade.StereoketenFacadeBuilder builder = new StereoketenFacade.StereoketenFacadeBuilder();
        StereoketenFacade stereoketen = builder
                .metCDPlayer(new CDPlayer())
                .metRadio(new Radio())
                .metEqualizer(new Equalizer())
                .metVersterker(new Versterker())
                .maakStereoketenFacade();
        stereoketen.start();
        stereoketen.getCdPlayer().start();
        stereoketen.stop();
        stereoketen.start();
                       
    }
    
}
