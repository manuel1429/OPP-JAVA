package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura =  new FiguraGeometrica(); NO se puede instacear
        FiguraGeometrica figura =  new Rectangulo("Rectangulo");
        figura.dibujar();
        
    }
}
