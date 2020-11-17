package test;

import domain.PersonaBean;

public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona =  new PersonaBean();
        
        persona.setNombre("Juan");
        persona.setApellido("Rivas");
        
        System.out.println("Persona = " + persona);
    }
}
