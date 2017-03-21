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
public class Bungalow implements Arrangement{

    @Override
    public String getTaken() {
        return "Reinig de bungalow \n";
    }
    
}
