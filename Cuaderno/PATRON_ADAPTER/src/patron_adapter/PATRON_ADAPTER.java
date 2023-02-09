package patron_adapter;



public class PATRON_ADAPTER {

    public static void main(String[] args) {
        Conectable lampara = new Lampara();
        Conectable ordenador = new Lampara();
        encenderAparato(lampara);
        encenderAparato(ordenador);
        
        /*lampara.encender();
        System.out.println("Esta encendida: "+ lampara.isEncendida());*/
        
        /*ordenador.encender();
        System.out.println("Esta encendido: "+ ordenador.isEncendida());*/

    }
    
    private static void encenderAparato(Conectable l1){
        l1.encender();
        System.out.println(l1.isEncendida());
        
    }
    
}
