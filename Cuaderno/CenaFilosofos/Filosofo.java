public class Filosofo extends Thread{
    private Mesa mesa;
    private int comensal;
    private int indiceComensal;

    public Filosofo(Mesa m, int comensal){
        this.mesa = m;
        this.comensal = comensal;
        this.indiceComensal = comensal - 1;
    }

    @Override
    public void run() {
        
        while(true){
            /*¿Tiene aspecto de patrón */
            this.pensando();
            this.mesa.cogerTenedor(indiceComensal);
            this.comiendo();
            System.out.println("Filósofo-> " + comensal 
                            + " deja de comer, tenedores libres "
                            + this.mesa.tenedorIzquierda(this.indiceComensal + 1) 
                            +", "
                            + this.mesa.tenedorDerecha(this.indiceComensal + 1) 
                        );
            this.mesa.dejarTenedor(this.indiceComensal);
        }

    }
    
    public void pensando(){
        
        System.out.println("Filósofo-> " + comensal + " pensando");
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
    }
     
    public void comiendo(){
        
        System.out.println("Filósofo-> " + comensal + " comiendo");
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
    }

}
