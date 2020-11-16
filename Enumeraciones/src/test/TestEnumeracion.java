
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeracion {
    public static void main(String[] args) {
        System.out.println("Dia uno de la semana " + Dias.LUNES); 
        
        indicarDiaSemana(Dias.MARTES);
        indicarDiaSemana(Dias.DOMINGO);
        
        System.out.println("Continente donde esta México " + Continentes.AMERICA);
        System.out.println("Numero de paises en AMERICA: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente donde esta Egipto " + Continentes.AFRICA);
        System.out.println("Numero de paises en AFRICA: " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            default:
                System.out.println("El dia no existe o no se ha declarado");
                break;
        }
    }
}
