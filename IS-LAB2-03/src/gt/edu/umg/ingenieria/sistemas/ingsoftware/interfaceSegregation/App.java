package gt.edu.umg.ingenieria.sistemas.ingsoftware.interfaceSegregation;

import java.util.*;

/**
 * 
 */
public class App {

    /**
     * Default constructor
     */
    public App() {
    }


    /**
     * @param args 
     * @return
     */
     public static void main(String[] args) {
     
     Delegate.makeCalculatorGraph(new GraphingCalculator());
     
     
     Delegate.makeCalculatorScientific(new ScientificCalculator(), 10);
    
     
    }

}