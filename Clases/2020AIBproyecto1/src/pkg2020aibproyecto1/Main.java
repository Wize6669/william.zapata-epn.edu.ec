
package pkg2020aibproyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        Scanner entrada=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero=entrada.nextInt();  
        boolean resp;
        resp = main.esPrimo(numero);
        if(resp == false){
            System.out.println("El numero "+numero+ " No es Primo !!");
        } else {
            System.out.println("El numero "+numero+" Es Primo !!");
        }
        
        
     }
     public boolean esPrimo(int numero) {  
     int a =0,i;    
     for (i=1;i <= numero; i++) {
            if (numero % i ==0 ){
            a++;
            }
        }
     if (a !=2) {
         return false;
     } else {
             return true;
             }
     }
     
    }
    

