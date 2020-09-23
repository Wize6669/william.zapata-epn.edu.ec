package Fuentes;

import java.util.Random;
    public class Matriz {
    private int [][] matriz;
    
        public Matriz(int N, int M){
            matriz= new int[N][M];
}
    public void setMatriz(){
        Random r= new Random();
        for(int i=0;i<this.matriz.length;i++){
            for(int j=0;j<this.matriz[i].length;j++){
                this.matriz[i][j]=r.nextInt(9)+1;
            }
        }
    }

    @Override
    public String toString() {
        String salida="";
        for(int i=0;i<this.matriz.length;i++){
            for(int j=0;j<this.matriz[i].length;j++){
                salida+=this.matriz[i][j]+" ";
            }
        }
        salida+="\n";
        return salida;
    }
    public Matriz sumaMatrices(Matriz B){
        Matriz matrizSumaAB = new Matriz(this.matriz.length, this.matriz[0].length);
        if((this.matriz.length!=B.matriz.length)&&(this.matriz[0].length!=B.matriz.length)){
            matrizSumaAB=null;
        }else{
            for(int i=0;i<this.matriz.length;i++){
                for(int j=0;j<this.matriz[0].length;j++){
                    matrizSumaAB.matriz[i][j]=this.matriz[i][j]+B.matriz[i][j];
                }
            }
        }
        return matrizSumaAB;
    }
    public Matriz productoMatriz(Matriz B){
        Matriz matrizProductoAXB = new Matriz(this.matriz.length, B.matriz[0].length);
        if(this.matriz[0].length!=B.matriz.length){
            matrizProductoAXB=null;
        }else{
            for(int i=0;i<this.matriz.length;i++){
                for(int j=0;j<B.matriz[0].length;j++){
                    for(int k=0;k<B.matriz.length;k++){
                        matrizProductoAXB.matriz[i][j]+= this.matriz[i][k]*B.matriz[k][j];
                    }
                }
            }
        }
        return matrizProductoAXB;
    }
    public Matriz productoEscalarMatriz(int escalar){
        Matriz matrizProdEsca = new Matriz(this.matriz.length, this.matriz[0].length);
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matrizProdEsca.matriz[i][j]=escalar*this.matriz[i][j];
            }  
        }
    return matrizProdEsca;
    }
    public int sumarDiagonalPrincipal(){
        int[] diagonalPrincipal = new int[this.matriz.length];
        int sumaDP = 0; 
        for( int i = 0; i < this.matriz.length; i++){
            for( int j = 0; j < this.matriz[i].length; j++) {
                if( i == j ) {
                    diagonalPrincipal[i] = this.matriz[i][j];
                    int auxiliar = diagonalPrincipal[i];
                    sumaDP = sumaDP + auxiliar;       
                }
            }      
        } 
        return sumaDP;
    }
    public int sumarDiagonalSecundaria(){
        int[] diagonalSecundaria = new int[this.matriz.length];
        int sumaDS = 0; 
        for( int i = 0; i < this.matriz.length; i++){
            for( int j = 0; j < this.matriz[i].length; j++) {
                if( i+j == matriz.length -1 ) {
                    diagonalSecundaria[i] = this.matriz[i][j];
                    int auxiliar = diagonalSecundaria[i];
                    sumaDS = sumaDS + auxiliar;       
                }
            }
        } 
        return sumaDS;
    }
    public boolean esPar(int elementoMatriz){
        return elementoMatriz %2 == 0;
    }
    public int sumarNumerosParesMatriz() {
        int numeroPar = 0;
        int sumaPares = 0;
         for( int i = 0; i < this.matriz.length; i++){
            for( int j = 0; j < this.matriz[i].length; j++) {
                if( esPar( this.matriz[i][j])) {
                    numeroPar = this.matriz[i][j];
                    sumaPares = sumaPares + numeroPar;
                }
            }
        }
         return sumaPares;
    } 
}
