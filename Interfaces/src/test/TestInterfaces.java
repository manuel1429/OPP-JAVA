package test;

import accesodatos.IAccesoDatos;
import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar();
        listarDatos(datos);
        
        datos = new ImplementacionOracle();
        //datos.listar();
        listarDatos(datos);
    }
    
    public static void listarDatos(IAccesoDatos datos){
        datos.listar();
    }
}
