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
public class Arbeid implements Kost{
    private BigDecimal uurloon;
    private BigDecimal gepresteerdeUren;

    public Arbeid(BigDecimal uurloon, BigDecimal gepresteerdeUren) {
        this.uurloon = uurloon;
        this.gepresteerdeUren = gepresteerdeUren;
    }
    
    @Override
    public BigDecimal getKost() {
        return uurloon.multiply(gepresteerdeUren);
    }
    
}
