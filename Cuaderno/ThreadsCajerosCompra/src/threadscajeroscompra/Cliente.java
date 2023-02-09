
package threadscajeroscompra;

import java.util.HashMap;


public class Cliente {
    private String nombre;
    private HashMap <Integer,String> productos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Integer, String> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Integer, String> productos) {
        this.productos = productos;
    }
    
    
    
}
