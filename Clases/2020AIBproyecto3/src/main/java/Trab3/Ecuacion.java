
package Trab3;

import javax.swing.JOptionPane;
import java.util.StringTokenizer;
        
public class Ecuacion {
    float numa, numb, numc; // num hace referencia a los coeficientes
                            // de la ecuacion 
    
    public Ecuacion(){
    
    }
    
    public Ecuacion(float numa, float numb, float numc){
        this.numa = numa;
        this.numb = numb;
        this.numc = numc;
    }
    
    public float getNumA(){
    return numa;
    }
    
    public void setNumA(float numa){
    this.numa = numa;
    }
    
    public float getNumB(){
    return numb;
    }
    
    public void setNumB(float numb){
    this.numb = numb;
    }
    
    public float getNumC(){
    return numc;
    }
    
    public void setNumC(float numc){
    this.numc = numc;
    }
    
    public Ecuacion sumaNumeros (Ecuacion nuEcua){
        Ecuacion ecuacion = new Ecuacion();
        ecuacion.numa = this.numa + nuEcua.numa;
        ecuacion.numb = this.numb + nuEcua.numb;
        ecuacion.numc = this.numc + nuEcua.numc;
        return ecuacion;
    }

    @Override
    public String toString() {
        return "Ecuación: " + numa +"x^ 2"+numb+"x^"+ numc;
    }
    
    public void SetCoeficientes(){
        String ecua;
        ecua=JOptionPane.showInputDialog("Ingrese los coefientes de la ecuació, es decir a,b y c separados por una coma");
        StringTokenizer tokens = new StringTokenizer(ecua,",");
        try{
            this.numa = Float.parseFloat(tokens.nextToken());
            this.numb = Float.parseFloat(tokens.nextToken());
            this.numc = Float.parseFloat(tokens.nextToken());
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar números, por favor !!!!");
            SetCoeficientes();
        
        }
    }
}
