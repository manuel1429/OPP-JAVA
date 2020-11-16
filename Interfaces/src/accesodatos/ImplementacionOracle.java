/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

/**
 *
 * @author MANUEL
 */
public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("INSERTAR DESDE ORACLE");
    }

    @Override
    public void listar() {
        System.out.println("LISTAR DESDE ORACLE");
    }

    @Override
    public void actualizar() {
        System.out.println("ACTUALIZAR DESDE ORACLE");
    }

    @Override
    public void eliminar() {
        System.out.println("ELIMINAR DESDE ORACLE");
    }
    
}
