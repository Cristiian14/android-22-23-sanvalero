public class Mesa{
    private boolean[] tenedores;

    public Mesa(int numTenedores){
        this.tenedores = new boolean[numTenedores];
    }

    public int tenedorIzquierda(int indiceComensal){
        return indiceComensal;
    }

    public int tenedorDerecha(int indiceComensal){
        if(indiceComensal==0){
            return this.tenedores.length - 1;
        }else{
            return indiceComensal - 1;
        }
    }

    public synchronized void cogerTenedor(int comensal){
        boolean izquierda = tenedores[tenedorIzquierda(comensal)];
        boolean derecha = tenedores[tenedorDerecha(comensal)];

        //TENEDORES OCUPADOS
        while(izquierda || derecha){
            try {
                wait();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        // O TENEDORES LIBRES
        tenedores[tenedorIzquierda(comensal)] = true;
        tenedores[tenedorDerecha(comensal)] = true;
    }

    public synchronized void dejarTenedor(int comensal){
        tenedores[tenedorIzquierda(comensal)] = false;
        tenedores[tenedorDerecha(comensal)] = false;
         notifyAll();
    }
}