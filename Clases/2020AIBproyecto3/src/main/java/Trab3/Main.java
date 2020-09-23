
package Trab3;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
 
        int opcion;
        Ecuacion ecuUno = new Ecuacion();
        Ecuacion ecuDos = new Ecuacion();
        Ecuacion resultanteNumeros = new Ecuacion();
        
        
        String salida="";
        do {
         
            salida+=ecuUno.toString()+"\n";
            
            ecuUno.SetCoeficientes();
            ecuDos.SetCoeficientes();
            resultanteNumeros = ecuUno.sumaNumeros(ecuDos);
            salida+="\n Primera ecuacion \n"+ ecuUno.toString();
            salida+="\n Segunda ecuacion \n"+ecuDos;
            salida+="\n ----------------- \n";
            salida+="\n Suma de las ecuaciones \n"+resultanteNumeros;
            
            
            opcion=JOptionPane.showConfirmDialog(null, "Deseas ingresar más ecuaciones", "Números",JOptionPane.YES_NO_OPTION);
           
        }while(opcion==JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, salida);   
    }
}
