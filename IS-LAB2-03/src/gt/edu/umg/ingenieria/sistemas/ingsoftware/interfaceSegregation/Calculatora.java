package gt.edu.umg.ingenieria.sistemas.ingsoftware.interfaceSegregation;

import java.util.*;

/**
 * 
 */
public class Calculatora implements BasicOperations {

    /**
     * Default constructor
     */
    public Calculatora() {
    }
    
    @Override
    public float addition(float a, float b) {
        return a+b;
    }

    @Override
    public float subtraction(float a, float b) {
        return a-b;
    }

    @Override
    public float division(float a, float b) {
        return a/b;
    }

    @Override
    public float multiplication(float a, float b) {
        return a*b;
    }

}