/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Bart.Stoebel
 */
public class CompositeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kost arbeid = new Arbeid(new BigDecimal(6.2),BigDecimal.valueOf(5.1));
        Project project1 = new Project();
        Project project2 = new Project();
        project1.add(arbeid);
        project1.add(new Grondstof(BigDecimal.valueOf(1000), BigDecimal.valueOf(3)));
        Kost grondstof = new Grondstof(new BigDecimal(1), new BigDecimal(2));
        project1.add(grondstof);
        project2.add(grondstof);
        project1.add(project2);
        System.out.printf(" project 1 : %s%n" ,project1.getKost().setScale(2, RoundingMode.HALF_UP));
        System.out.println("project 2 : " + project2.getKost().setScale(2, RoundingMode.HALF_UP));
    }
}
