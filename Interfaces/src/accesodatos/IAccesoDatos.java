package accesodatos;

//no extiende de la clase object
//todos sus metodos son abstractos
//todos sus atributos son constantes: public final y static
//Se usa cuando sus subclases tienen comportamientos similares por ejemplo las bases de datos Mysql Y Oracle
public interface IAccesoDatos {
    int MAX_REGISTRO = 10; //DE MANERA OBLIGATORIA DEBEMOS DEFINIRLO
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
