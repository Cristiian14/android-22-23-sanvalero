
package cajeras;

public class Main {

    public static void main(String[] args) {
        long tiempo = System.currentTimeMillis();

        Cliente cliente1 = new Cliente("Paco", new int[] {1,3,5});
        Cliente cliente2 = new Cliente("Jose", new int[] {3,4,4,1});
        
        Cajera cajera1 = new Cajera("Cajera 1", tiempo, cliente1);
        Cajera cajera2 = new Cajera("Cajera 2", tiempo, cliente2);
        
        cajera1.start();
        cajera2.start();

    }
    
}
