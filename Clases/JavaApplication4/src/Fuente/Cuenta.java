
package Fuente;
public class Cuenta {
    
    private long numCuenta; 
    private float saldo; 
    
    public Cuenta(){}
    public Cuenta(long numCuenta){
        this.numCuenta = numCuenta;
        this.saldo = 0;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setDeposito(float deposito){
        
        float tenia = this.saldo;
        this.saldo= tenia + deposito;
                
    }
    
    public float retiro(float retirar)
    {
        if(this.saldo >= retirar){
            float tengo = this.saldo - retirar;
            this.saldo = tengo;
            return retirar;
        }
        return 0;
    }
    
    public String toString()
    {
        return "Cuenta : " + numCuenta + "\n"
                + "Saldo Actual: " + saldo + "\n";
    }
    
}
