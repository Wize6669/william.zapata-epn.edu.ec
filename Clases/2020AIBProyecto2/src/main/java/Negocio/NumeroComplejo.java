
package Negocio;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class NumeroComplejo {
    private float entera;
    private float imaginaria;
    
    public NumeroComplejo(){
        
    }
    
    public NumeroComplejo(float entera, float imaginaria){
    this.entera = entera;
    this.imaginaria = imaginaria;
    }
    
    public float getEntera(){
    return entera;
    }
    
    public void setEntera(float entera){
    this.entera = entera;
    }
    
    public float getImaginario(){
    return imaginaria; 
    }
    
    public void setImaginaria(float imaginaria){
    this.imaginaria = imaginaria;
    }
    
    public NumeroComplejo sumaComplejos (NumeroComplejo nCl){
        
        NumeroComplejo numC= new NumeroComplejo();
        numC.entera = this.entera + nCl.entera;
        numC.imaginaria = this.imaginaria + nCl.imaginaria;
        return numC;
    }
    
    public NumeroComplejo restaComplejos (NumeroComplejo nCl){
        
        
        NumeroComplejo numCo=new NumeroComplejo();
        numCo.entera = this.entera - nCl.entera;
        numCo.imaginaria = this.imaginaria - nCl.imaginaria;
        return numCo;
       
    }

    @Override
    public String toString() {
        return "NumeroComplejo{"+" entra= "+entera+", imaginaria= "+imaginaria+"}";
    }
    
    public void setNumeroComplejo(){
    String linea;
    linea=JOptionPane.showInputDialog("Ingrese" + "la parte entera y la parte imaginaria del número complejo separado por una coma","Números");
    StringTokenizer tokens = new StringTokenizer(linea,",");
    try{
    this.entera = Float.parseFloat(tokens.nextToken());
    this.imaginaria = Float.parseFloat(tokens.nextToken());
    }catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null, "Debe ingresar números !!");
    e.printStackTrace();
    setNumeroComplejo();
    
        }
    }
     
    
}
