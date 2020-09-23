
package pkg2020aibproyecto1;

import java.util.Scanner;

public class Numero {
    private int x;

    public Numero() {
        this.x=0;
    }

    public Numero(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean esPar()
    { return this.x%2==0;
  }
    
    public static void main(String[] args) {
    
       Numero numero= new Numero();
       
       System.out.println("1.- El valor inicial X = " + numero.getX());
       // numero.setX(10);
       numero.setNumero();
       System.out.println("2.- Nuevo valor de X es = " + numero.getX());
       if(numero.esPar())
           System.out.println("3.- X = " + numero.getX()+ " Es Par!!");
       else
           System.out.println("3.- X = " + numero.getX()+" Es Inpar!!");
       System.out.println("4.- El factorial de "+ numero.getX()+ " es: "+numero.calcularFactorial());
       if(numero.esPerfecto()== true){
           System.out.println("5.- El numero "+numero.getX()+" es perfecto");
       }else{
           System.out.println("5.- El numero no "+numero.getX()+" es perfecto");
       }
       System.out.println("6.- La suma de los digitos de "+numero.getX()+" es: "+numero.SumaDigitos());
       
    }
    
    public long SumaDigitos(){
    int aux, suma=0;
    aux = this.x;
    do{
      suma+= aux%10;
      aux = aux/10;
       }while(aux!=0);
    return suma;
    }
    
    public boolean esPerfecto(){
    int suma =0;
    for(int i=1; i<this.x;i++){
        if(this.x%1==0){
            suma +=1;
        }
    }
    if(suma==this.x){
        return true;
    }
    return false;
    }
 
    public long calcularFactorial(){
        long factorial = 1;
        for(int i=2;i<=this.x;i++){
            factorial *= i;
        }
     return factorial; 
    }    
        
    public void setNumero()
    {
    
        Scanner sc= new Scanner(System.in);
        try
        {
            System.out.print("Ingrese un numero: ");
            this.x = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Por favor ingrese numeros"+e);
            setNumero();
        }
  
    }
    
    @Override
    public String toString() {
        return "Numero{" + "x=" + x + '}';
    }
    
  
   
}
