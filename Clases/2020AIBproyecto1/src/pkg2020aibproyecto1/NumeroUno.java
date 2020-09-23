
package pkg2020aibproyecto1;

import javax.swing.JOptionPane;

public class NumeroUno {
   
    public void setNumeroUno(){
        int opcion=0;
        int num;
        String nume;
        String op="";
        op=JOptionPane.showInputDialog("SELECCIONAR UNA OPCION: \n"
                +"1.- Sumar los digítos de un número\n"
                +"2.- Determinar si un número es perfecto\n"
                +"3.- El factorial de un número");
        opcion=Integer.parseInt(op);
        switch(opcion){
            case 1:
                nume=JOptionPane.showInputDialog("Ingrese un número: ");
                num=Integer.parseInt(nume);
                int aux, suma=0;
                aux = num;
                do{
                    suma+=aux%10;
                    aux = aux/10;
                }while(aux!=0);
                JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                break;
            case 2:
                nume=JOptionPane.showInputDialog("Ingrese un número: ");
                num=Integer.parseInt(nume);
                int sum=0;
                for(int i=1; i<num;i++){
                    if(num%1==0){
                        sum +=1;
                    }
                }if(sum==num){
                    JOptionPane.showMessageDialog(null, "Es un Número Perfecto");
                }else{
                    JOptionPane.showMessageDialog(null, "No es un Número Perfecto");
                }
                break;
            case 3:
                nume=JOptionPane.showInputDialog("Ingrese un número: ");
                num=Integer.parseInt(nume);
                long factorial =1;
                for(int i=2;i<=num;i++){
                    factorial *=i;
                }
                JOptionPane.showMessageDialog(null, "El factorial de "+num+ " es: "+factorial);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Debe ingresar una opción valida !!!"); 
        }
    
    }
    
    
    
    

    
}
