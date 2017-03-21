/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Bart.Stoebel
 */
public class Project implements Kost{
    private List<Kost> kosten= new ArrayList<>();;

    public void add(Kost kost){
        kosten.add(kost);
    }
    
    @Override
    public BigDecimal getKost() {
        BigDecimal totaal = BigDecimal.ZERO;
        if (!kosten.isEmpty()){
            for(Kost kost : kosten){
                totaal = totaal.add(kost.getKost());
            }
        }
        return totaal;
    }
    
}
