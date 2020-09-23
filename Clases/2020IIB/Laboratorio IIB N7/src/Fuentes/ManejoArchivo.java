package Fuentes;

import java.io.*;
public class ManejoArchivo {
    File fe;
    File fo;
    BufferedReader entrada;
    BufferedWriter salida;
    Numero numero;

    public ManejoArchivo() throws FileNotFoundException, IOException {
        fe = new File("C:\\Users\\zapat\\OneDrive\\Escritorio\\Datos\\Datos.txt");
        fo = new File ("Resultado.txt");
        entrada = new BufferedReader(new FileReader(fe));
        salida = new BufferedWriter(new FileWriter(fo, true)); 
        
        numero = new Numero();   
    }
    
    public void operar() throws IOException{
        long factorial;
        int numero1;
        String linea ="";
        try{
            while (entrada.ready()){
                linea = entrada.readLine();
                numero1 = Integer.parseInt(linea);
                numero.setNumero(numero1);
                factorial = numero.factorial();
                //System.out.println("\r\n Factorial: " + factorial);
                salida.write("El Factorial del " + numero + " es :" + factorial);
                salida.newLine();
            }
            
        } catch (IOError e){
            e.printStackTrace();
        }
        entrada.close();
        salida.close();
    }
    
    public String leerTxt(){
        String cadena = " ";
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fo));
            
            while(bf.ready()){
                cadena += bf.readLine();
                cadena += "\n";
            }
        } catch (Exception e){
            System.out.println("No se encontro el archivo");
        }
        return cadena;
    }
}
