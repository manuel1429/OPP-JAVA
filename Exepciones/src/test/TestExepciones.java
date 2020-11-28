package test;

import aritmetica.Aritmetica;
import static aritmetica.Aritmetica.*;
import exepciones.OperacionExcepcion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.OperationsException;

public class TestExepciones {
    public static void main(String[] args) {
        
        int resultado = 0;
        
        try{
            resultado = 10/0;
        }catch (Exception ex) {
            ex.printStackTrace(System.out); //imprimir pila de exepciones.
        }finally{
            System.out.println("Se valido la divicion entre 0");
        }
        System.out.println("" + resultado);
        
        System.out.println("");
        try {
            resultado = divicion(10, 0);
        } catch (OperacionExcepcion ex) {
            ex.printStackTrace(System.out);
            System.out.println(ex.getMessage()); //imprimir msg
        }
        
        System.out.println("");
        try {
            resultado = divicion(10, 0);
        } catch (OperacionExcepcion ex) {
            System.out.println("Ocurrio un error de tipo OperacionException");
            System.out.println(ex.getMessage()); 
        } catch(Exception ex) {
            System.out.println("Ocurrio un error de tipo Exception");
            System.out.println(ex.getMessage()); 
        }
        
        //Exepcion tipo runtime
        System.out.println("");
        resultado = divicionOERE(10, 0);
        System.out.println("resultado = " + resultado);
    }
}
