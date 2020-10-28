
package mundopc;


public class Orden {
    
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has superado el limite de computadoras");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("ORDEN N°:"+ this.idOrden);
        System.out.println("COMPUTADORAS DE LA ORDEN");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
