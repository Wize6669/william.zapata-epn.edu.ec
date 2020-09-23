
package Fuentes;


public class Cuenta {
    long numeroCuenta;
    float saldo;
    
    public Cuenta(){

    }
    
    public Cuenta(long numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = 60 ;
    }
    
    public  void setCuenta(long ncuenta, float saldo)
    {
        this.numeroCuenta= ncuenta;
        this.saldo= saldo;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void setDepositar(float deposito){
        float valorInicial = this.saldo;
        this.saldo = valorInicial + deposito;
    }
    
    public float setRetirar(float retiro){
        if(this.saldo>=retiro){
            float valorInicial = this.saldo - retiro;
            this.saldo = valorInicial;
            return retiro;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cuenta\n" + "Numero de Cuenta : " + numeroCuenta + ", Saldo : " + saldo + '}';
    }
    
    
    
 


    
}
