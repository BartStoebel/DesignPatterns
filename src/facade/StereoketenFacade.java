/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 * Ook het Builder Design Pattern werd hier gebruikt!!
 * @author Bart.Stoebel
 */
public class StereoketenFacade {
    private CDPlayer cdPlayer;
    private Equalizer equalizer;
    private Radio radio;
    private Versterker versterker;
    
    private StereoketenFacade(CDPlayer cdPlayer, Equalizer equalizer, Radio radio, Versterker versterker) {
        this.cdPlayer = cdPlayer;
        this.equalizer = equalizer;
        this.radio = radio;
        this.versterker = versterker;
    }
    
    public void start(){
        System.out.println("Stereoketen wordt gestart");
    }
    public void stop(){
        System.out.println("Stereoketen wordt gestopt");
    }
    
    public static class StereoketenFacadeBuilder{
        private CDPlayer cdPlayer;
        private Equalizer equalizer;
        private Radio radio;
        private Versterker versterker;
        
        public StereoketenFacadeBuilder metCDPlayer(CDPlayer cdplayer){
            this.cdPlayer = cdplayer;
            return this;
        }
        public StereoketenFacadeBuilder metEqualizer (Equalizer equalizer){
            this.equalizer = equalizer;
            return this;
        }
        public StereoketenFacadeBuilder metRadio (Radio radio){
            this.radio = radio;
            return this;                     
        }
        public StereoketenFacadeBuilder metVersterker (Versterker versterker){
            this.versterker = versterker;
            return this;
        }
        public StereoketenFacade maakStereoketenFacade(){
            return new StereoketenFacade(cdPlayer, equalizer, radio, versterker);
        }
        
        
        
    }
}
