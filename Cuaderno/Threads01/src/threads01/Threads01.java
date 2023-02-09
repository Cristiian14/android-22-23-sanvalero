
package threads01;

/*HERENCIA SIMPLE*/
public class Threads01 extends Thread{//extends Pizza
    
    public Threads01(String threadName){
        super(threadName);
    }
    
    /*UN PLAY!!!!!!!!!!*/
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + super.getName());
                System.out.println("Termina Thread " + super.getName());
        }
    }
    
    
    
    public static void main(String[] args) {
      /*ACTIVAR SEMAFORO*/
      /*
      new Threads01("COMANDANTE").start();
      new Threads01("CENTURION").start();
        System.out.println("Termina Programacion Threads(). ");
      */
      new Thread (new SoldierRunnable(), "COMANDANTE").start();
      new Thread (new SoldierRunnable(), "CENTURION").start();
        System.out.println("Termina Programacion Threads(). ");
    }
    
}
