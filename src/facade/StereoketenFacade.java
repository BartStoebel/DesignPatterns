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
    private Geluidsbron huidigeGeluidsbron;
    private boolean gestart;
    
    private StereoketenFacade(CDPlayer cdPlayer, Equalizer equalizer, Radio radio, Versterker versterker) {
        this.cdPlayer = cdPlayer;
        this.equalizer = equalizer;
        this.radio = radio;
        this.versterker = versterker;
    }
    
    public void start(){
        System.out.println("Stereoketen wordt gestart");
        versterker.start();
        equalizer.start();
        if(huidigeGeluidsbron !=null){
            huidigeGeluidsbron.start();
        }
        gestart = true;
        
    }
    public void stop(){
        System.out.println("Stereoketen wordt gestopt");
        versterker.stop();
        equalizer.stop();
        if(huidigeGeluidsbron !=null){
            huidigeGeluidsbron.stop();
        }
        gestart = false;
        
    }
    
    public void startCDplayer(){
        if (gestart) {
            if (huidigeGeluidsbron != null) {
                huidigeGeluidsbron.stop();
            }
            cdPlayer.start();
            huidigeGeluidsbron = cdPlayer;
            }

    }
    public void startRadio(){
        if (gestart) {
            if (huidigeGeluidsbron != null) {
                huidigeGeluidsbron.stop();
            }
            radio.start();
            huidigeGeluidsbron = radio;
            }
    }

    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public Radio getRadio() {
        return radio;
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
