/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Bart.Stoebel
 */
public class BuilderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inwoner.InwonerBuilder builder = new Inwoner.InwonerBuilder();
        Inwoner inwoner = builder.metVoornaam("Bart")
                .metAantalKinderen(1)
                .metFamilienaam("Stoebel")
                .metGehuwd(true)
                .metAantalKerenVerhuisd(3)
                .maakInwoner();
    }
    
}
