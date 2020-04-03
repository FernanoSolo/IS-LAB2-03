package gt.edu.umg.ingenieria.sistemas.ingsoftware.interfaceSegregation;

import java.util.*;

/**
 * 
 */
public class ScientificCalculator extends Calculatora implements TrigonometricFunctions {

    /**
     * Default constructor
     */
    public ScientificCalculator() {
    }
    
    @Override
    public void tan(double a){
      double b = Math.toRadians(a);
      System.out.println("Tangente de " + a + " es: " + Math.tan(b) );
    }
    
    @Override
    public void sin(double a){
         double b = Math.toRadians(a);
         System.out.println("Seno de " + a + " es: " + Math.sin(b) );       
    }
    @Override
    public void cos(double a){
         double b = Math.toRadians(a);
         System.out.println("Coseno de " + a + " es: " + Math.cos(b) );    
    }


}