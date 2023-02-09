
package threadscajeroscompra;


public class Cajera_o_e {
    private String nombre;
    
    public void procesarCompra(Cliente cliente, long inicio){
        
        String cade1 = "La cajera " + this.nombre;
                cade1 += " COMIENZA A PROCESAR LA COMPRA ";
                cade1 += "del Cliente " + cliente.getNombre();
                cade1 += "EN EL TIEMPO " + (System.currentTimeMillis() - inicio)/1000 + " sg";
                
        for (int i = 0; i < cliente.getProductos().size(); i++) {
            // TIEMPO EN ESCANEAR EL PRODUCTO
            System.out.println("Procesando el producto " +
                    (System.currentTimeMillis() - inicio)/1000 + " sg");
        }
        
    }
}
