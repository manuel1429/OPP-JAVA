
package ventas;


public class Orden {
    
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    // Constante con el maximo de productos que puede tener una orden
    private static final int MAX_PRODUCTOS = 10; 
    //Variable para saber cuantos obj de tipo producto se agregaron a la orden
    private int contadorProductos; 
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes; //Generar el idOrden del obj orden
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; //Inicializar arreglo productos
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos");
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for(int i=0; i < this.contadorProductos; i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Orden N°:" + this.idOrden  );
        System.out.println("Productos de la orden:");
        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
        System.out.println("Total = " + this.calcularTotal() );
    }
}
