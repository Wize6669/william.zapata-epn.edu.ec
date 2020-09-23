package Negocio;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
         NumeroComplejo numComplejo = new NumeroComplejo();
         NumeroComplejo segundoComplejo = new NumeroComplejo();
         NumeroComplejo resultanteComplejo = new NumeroComplejo();
         NumeroComplejo resultanteComplejoResta = new NumeroComplejo();
         // int opcion;
         String salida="";
        /* do
            {
                numComplejo.setNumeroComplejo();
                salida+=numComplejo.toString()+"\n";
 
                opcion=JOptionPane.showConfirmDialog(null,"Mas número complejos? ", "Datos", JOptionPane.YES_NO_OPTION);

         }while(opcion==JOptionPane.YES_NO_OPTION);
        
  */
        numComplejo.setNumeroComplejo();
        segundoComplejo.setNumeroComplejo();
        resultanteComplejo=numComplejo.sumaComplejos(segundoComplejo);
        salida+="\n Primer Complejo \n"+ numComplejo.toString();
        salida+="\n Segundo Complejo\n"+ segundoComplejo;
        salida+="\n ----------------- \n";
        salida+="\n Suma Compleja \n"+ resultanteComplejo;
        
        resultanteComplejoResta=numComplejo.restaComplejos(segundoComplejo);
        salida+="\n Primer Complejo \n"+numComplejo.toString();
        salida+="\n Segundo Complejo \n"+segundoComplejo;
        salida+="\n ----------------- \n";
        salida+="\n Resta Compleja \n"+resultanteComplejoResta;
                
        JOptionPane.showMessageDialog(null, salida);
    }
    

}
