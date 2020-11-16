package domain;

public class Persona {
    
    //bloques estaticos y no estaticos
    //ambos se inicializan antes del constructor
    
    private final int idPersona;
    private static int contadorPersona;
    
    //bloque estatico se ejecuta primero y solo se ejecuta una vez
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
    }
    //bloque no estatico, se ejecuta antes del constructor, 
    //y se ejecuta cada que se crea un objeto
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Contructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
