package test;

import genericos.ClaseGenerica;

public class TestGenericos {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        System.out.println("");
        ClaseGenerica<String> objetoStr = new ClaseGenerica("Juan");
        objetoStr.obtenerTipo();
    }
}
