
package Fuente;

import java.io.*;


public class ManejoArchivos {
    
    File fe; //= new File("C:\\Users\\zapat\\OneDrive\\Escritorio\\Datos");  
    File fs; // = new File("C:\\Users\\zapat\\OneDrive\\Escritorio\\Datos");
    BufferedReader entrada;
    BufferedReader salida;
    
    Numero numero;
    String linea = "";

    public ManejoArchivos() throws FileNotFoundException {
        fe = new File("");
        fs = new File ("salida.txt");
        entrada = new BufferedReader(new FileReader(fe));
        salida = new BufferedWriter(new FileWriter(fs));
        numero = new Numero();
    }
    
    public void operar() {
    long factorial;
    int numero1;
        try{
            while(entrada.ready()) {
                linea = entrada.readLine();
                numero1 = Integer.parseInt(linea);
                numero.setNumeros(numero1);
            }
        
        
        }catch() {
        
        }
}
    
    
}
