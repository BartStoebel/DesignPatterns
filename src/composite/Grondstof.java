/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.math.BigDecimal;

/**
 *
 * @author Bart.Stoebel
 */
public class Grondstof implements Kost{
    private BigDecimal eenheidsprijs;
    private BigDecimal hoeveelheid;

    public Grondstof(BigDecimal eenheidsprijs, BigDecimal hoeveelheid) {
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheid = hoeveelheid;
    }
    
    @Override
    public BigDecimal getKost() {
        return eenheidsprijs.multiply(hoeveelheid);
    }
    
    
}
