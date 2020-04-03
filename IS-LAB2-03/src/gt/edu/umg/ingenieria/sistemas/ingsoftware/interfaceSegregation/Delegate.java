package gt.edu.umg.ingenieria.sistemas.ingsoftware.interfaceSegregation;

import java.util.*;

/**
 * 
 */
public class Delegate {

    /**
     * Default constructor
     */
    public Delegate() {
    }

    /**
     * @param calc 
     * @return
     */
    public static void makeCalculatorGraph(Graphics calc) {
        // TODO implement here
       calc.graph();
    }

    /**
     * @param calc 
     * @param var 
     * @return
     */
    public static void makeCalculatorScientific(TrigonometricFunctions calc, double var) {
        // TODO implement here
        ScientificCalculator des = new ScientificCalculator();
        System.out.println("La suna es 10+20 es "+des.addition(10, 20)); 
   
        calc.cos(var);
        calc.sin(var);
        calc.tan(var);
    }

}