
package Fuentes;

import java.util.Random;
import java.util.Arrays;
public class Vector {
    
    private int vector[]; //N será el número de ocurrencias del vecto
    
    public Vector(int N) {
        vector = new int[N]; //es necesario instanciar
    }
    
    public void setVector() {
        
        Random num = new Random();
        for ( int i = 0; i<this.vector.length ; i++) {
            this.vector[i] = num.nextInt(10)+1; //Numero entre 1 y 10
            
        }   
    }

    @Override
    public String toString() {
        String salida=""; //en salida preparamos el vector para despliegue
        for ( int i=0 ; i<this.vector.length ; i++) {
            salida+= this.vector[i]+" "; //numeros entre 1 y 10
        }
        return salida;
    }
    
    public long sumarElementos() {
        long suma = 0;
        for ( int i = 0; i <this.vector.length; i++) {
            suma += this.vector[i];
        }
        return suma;
    }
  
    public boolean esPrimo( int n) {
        int cont = 0;
        for( int i=1; i<=n; i++){
        if (n%i == 0) {
            cont++;
        }
        }
        return (cont==2);
    }
    
    public long sumarPrimos() {
        long suma = 0;
        for ( int i = 0; i < this.vector.length; i++) {
            if(esPrimo(this.vector[i])) {
                suma+= this.vector[i]; 
            }
        }
     return suma;   
    }
    
     public boolean esPerfecto( int n ) {
        int sumaDiv = 0;
        for ( int i=1; i< n ; i++ ) {
            if (n % i == 0 ){
                sumaDiv = sumaDiv + i;
            }
        } 
        if ( sumaDiv == n ){
            return true;
        } else {
            return false;
        }
    }
     
    public long detectarNPerfectos() {
        long contador = 0;
         for ( int i = 0; i < this.vector.length; i++ ) {
             if( esPerfecto(this.vector[i])) {
                 contador += contador + 1;
             }
         }
         return contador;
    }
    
    public void ordenarVector() {
        for( int i = 0; i<(this.vector.length); i++){
            for( int j= i+1 ; j < this.vector.length; j++ ) {
                if( this.vector[i] > this.vector[j] ) {
                    int variableAuxiliar = this.vector[i];
                     this.vector[i] = this.vector[j];
                     this.vector[j] = variableAuxiliar;
                }
            }     
        }    
    }
    
    public long calcularNumeroMayor() {
      long mayor = this.vector[0];
        for( int i=0 ; i < this.vector.length ; i++ ){
            if(mayor < this.vector[i]) {
                mayor = this.vector[i];
            }
        }
        return mayor;   
    }
   
    
    public int busquedaBinaria(int l,int r, int x) { 
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
  
        if (this.vector[mid] == x) 
            return mid; 
        
        if (this.vector[mid]> x) 
            return busquedaBinaria(l, mid - 1, x); 
 
        return busquedaBinaria(mid + 1, r, x); 
    } 
 
    return -1; 
    }
    
     public void clasificarArray() {
           Arrays.sort(vector);
        }
    
    
    public long busquedaBinariaArray(int x){
       Arrays.sort(vector);
       int indiceXD = Arrays.binarySearch(vector, x);
       return indiceXD;
    }
    
    public long conocerNumeroMayorArray() {
        long Nmayor = this.vector[0];
        for( int i=0 ; i < this.vector.length ; i++ ){
            if(Nmayor < this.vector[i]) {
                Nmayor = this.vector[i];
            }
        }
        return Nmayor;   
    }
    
    
} 
       
    
   
     
 
       
