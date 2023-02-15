
package cajeras;

public class Cliente {
    private String nombre;
    private int[] carrito;

    public Cliente() {
    }

    public Cliente(String nombre, int[] carrito) {
        this.nombre = nombre;
        this.carrito = carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarrito() {
        return carrito;
    }

    public void setCarrito(int[] carrito) {
        this.carrito = carrito;
    }
    
    
}
