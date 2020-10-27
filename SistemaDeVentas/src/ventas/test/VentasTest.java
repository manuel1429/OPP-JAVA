
package ventas.test;

import ventas.Orden;
import ventas.Producto;


public class VentasTest {
    public static void main(String[] args) {
        Producto refresco = new Producto("Refresco", 3.5);
        Producto papas = new Producto("Papas", 2.9);
        Producto chicles = new Producto("Chicles", 0.5);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(papas);
        orden1.agregarProducto(chicles);
        orden1.agregarProducto(refresco);
        
        orden1.mostrarOrden();
        
    }
}
