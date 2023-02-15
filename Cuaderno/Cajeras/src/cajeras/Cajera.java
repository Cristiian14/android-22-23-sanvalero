
package cajeras;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cajera  extends Thread{
    private String nombre;
    private long tiempoCajera;
    private Cliente cliente;

    public Cajera() {
    }

    public Cajera(String nombre, long tiempoCajera, Cliente cliente) {
        this.nombre = nombre;
        this.tiempoCajera = tiempoCajera;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTiempoCajera(long tiempoCajera) {
        this.tiempoCajera = tiempoCajera;
    }

    public long getTiempoCajera() {
        return tiempoCajera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {        
        System.out.println("La cajera " + this.getNombre() + 
                " ha empezado a procesar la compra del cliente " + cliente.getNombre() +
                " en el tiempo: " + (System.currentTimeMillis() - tiempoCajera) / 1000);
        
        for (int i = 0; i < cliente.getCarrito().length; i++) {
            try {
                sleep(cliente.getCarrito()[i] * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cajera.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Procesando el producto " + (i+1) + 
                    " del cliente " + cliente.getNombre()+
                    " -> Tiempo: " + (System.currentTimeMillis() - tiempoCajera) /1000);

        }
        
        System.out.println("La cajera " + this.getNombre() + 
                " ha terminado de procesar " + cliente.getNombre() +
                " en el tiempo: " + (System.currentTimeMillis() - tiempoCajera) /1000);
    }
    
    
}
