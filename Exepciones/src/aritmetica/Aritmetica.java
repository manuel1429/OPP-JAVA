package aritmetica;

import exepciones.OperacionExcepcion;
import exepciones.OperacionExepcionRE;

public class Aritmetica {
    public static int divicion(int num, int denominador) throws OperacionExcepcion {
        if(denominador ==0){
            throw new OperacionExcepcion("Divicion entre 0");
        }
        
        return num/denominador;
    }
    
    public static int divicionOERE(int num, int denominador){
        if(denominador ==0){
            throw new OperacionExepcionRE("Divicion entre 0");
        }
        
        return num/denominador;
    }
}
