
package mundopc.test;

import mundopc.*;


public class MundoPcTest {
    public static void main(String[] args) {
        Monitor monitorHp =  new Monitor("HP", 13);
        Teclado tecladoHp = new Teclado("USB", "HP");
        Raton ratonHp = new Raton("USB", "HP");
        
        Computadora computadoraHp =  new Computadora("PC HP", monitorHp, tecladoHp, ratonHp);
        
        Monitor monitorDell =  new Monitor("DELL", 22);
        Teclado tecladoDell = new Teclado("USB", "DELL");
        Raton ratonDell = new Raton("USB", "DELL");
        
        Computadora computadoraDell =  new Computadora("PC DELL", monitorDell, tecladoDell, ratonDell);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHp);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();
    }
}
