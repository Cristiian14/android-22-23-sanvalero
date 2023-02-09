public class UnObservador implements IObservador


{
    private String nombre;

    // ---------------------------------

    public UnObservador(String nombre) {
        this.setNombre(nombre);
        System.out.println("Avion [" + this.nombre + "] creado");
    }

    // ---------------------------------

    public String getNombre() {
        return this.nombre;
    }

    // ---------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ---------------------------------

    @Override
    public void observadoActualizado(String direccion) {
      System.out.println("El avion [" + this.getNombre() + "] se mueve en direccion: " + direccion);
    }
}