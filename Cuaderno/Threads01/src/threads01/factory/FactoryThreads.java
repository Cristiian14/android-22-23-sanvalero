
package threads01.factory;

import threads01.SoldierRunnable;


public class FactoryThreads {
    private static final String COMANDANTE = "COMANDANTE";
    private static final String CENTURION = "CENTURION";
    private static final String SOLDADO = "SOLDADO";
    
    public static SoldierRunnable getInstance(String SoldierSelected){
       SoldierRunnable soldier = null;
       switch(SoldierSelected){
           case COMANDANTE:
               
           break;
       }
               
        return null;
    }
}
