package test;
import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchvos {
    public static void main(String[] args) {
        String nombreArchivo = "Prueba.txt";
//        crearArchivo(nombreArchivo);
//        escribirArchivo(nombreArchivo, "Hola desde Java");
//        sobrescribirArchivo(nombreArchivo, "Adios");
        leerArchivo(nombreArchivo);
    }
}
