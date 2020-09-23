
package pkg2020aibproyecto1;

import javax.swing.JOptionPane;

public class Main1 {
    
    public static void main(String[] args){
    NumeroUno numeroUno = new NumeroUno();
    int opcion;
    String salida="";
    do{
        numeroUno.setNumeroUno();
        salida+=numeroUno.toString()+"\n";
        
        opcion=JOptionPane.showConfirmDialog(null,"Desea realizar otra operación ¿?", "Operaciones", JOptionPane.YES_NO_OPTION);
    }while(opcion==JOptionPane.YES_NO_OPTION);
    JOptionPane.showMessageDialog(null, salida);
    
    }
    
}
