
package ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        Producto.contadorProductos++;
        this.idProducto = Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this(); //Llamar constructor privado
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + this.idProducto + ", nombre=" + this.nombre + ", precio=$" + this.precio + '}';
    }
    
    
    
}
