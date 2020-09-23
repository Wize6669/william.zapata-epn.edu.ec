
package Fuentes;

public class Numero {
    private int numero;
    
    public Numero(){
        super();
        numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public long factorial(){
        long fact = 1;
        for (int i = 1; i <= this.numero; i++){
            fact*= i;
        }
        return fact;
    }

    @Override
    public String toString() {
        return "numero " + numero;
    }

    
}
