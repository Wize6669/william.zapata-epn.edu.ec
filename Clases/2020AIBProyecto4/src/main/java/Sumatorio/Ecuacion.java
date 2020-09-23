
package Sumatorio;

public class Ecuacion {
    private float numeroN;
    
    public Ecuacion() {

    }

    public Ecuacion(float numeroN){
        this.numeroN = numeroN;
    }
    
    public float getNumeroN() {
        return numeroN;
    }
    
    public void setNumeroN(float numeroN) {
        this.numeroN = numeroN;
    }

    @Override
    public String toString() {
        return "Se tiene una sumatoria de: \n " 
                + " 1 " + " hasta " + numeroN 
                + "\n y su resultado es: ";
    }
    
    public double factorialnumeroN(int n) {
        int fact = 1;
        if ( n < 0 ) {
            fact = 0;  
        } else {
            if ( n == 0 ){
                fact = 1;
            } else {
                for ( int i =1; i <= n; i++ ){
                    fact = fact * i;
                }
            } 
        }
        return fact;  
    } 
    
    public float sumatoriaEcuacion() {
        float resultadoSum = 0;
        
        for(  int j = 1 ; j <= this.numeroN ; j++) {
               
        resultadoSum += ( j / factorialnumeroN(j) );
            
        }
        return resultadoSum;
    }   
}