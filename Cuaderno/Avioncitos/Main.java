public class Main
{
    public static void main(String[] args)
    {

         UnObservado guia = new UnObservado();
         guia.setDireccion("derecha");

         UnObservador avion1  = new UnObservador("Avion 1");
         guia.agregarObservador(avion1);

        UnObservador avion2  = new UnObservador("Avion 2");
        guia.agregarObservador(avion2);

        UnObservador avion3 = new UnObservador("Avion 3");
        guia.agregarObservador(avion3);

    }

    
}