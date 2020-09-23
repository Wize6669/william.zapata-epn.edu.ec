
package Fuentes;

public class Estudiante {
   private String nombre;
   private long cedula;
   private float n1, n2, n3;
   
   public Estudiante(){
   
   }
   
   public Estudiante(String nombre, long cedula, float n1, float n2,float n3){
       this.nombre = nombre;
       this.cedula = cedula;
       this.n1 = n1;
       this.n2 = n2;
       this.n3 = n3;
   }
   public void setEstudiante(String nombre, long cedula, float n1, float n2,float n3){
       this.nombre = nombre;
       this.cedula = cedula;
       this.n1 = n1;
       this.n2 = n2;
       this.n3 = n3;   
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    
    public boolean aprueba(){
        return (promedio()>7);
    } 
    
    public float promedio(){
        return (n1+n2+n3)/3;
    }
    
    public boolean Validacion1(){
        if(n1>0 && n1<=10){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Validacion2(){
        if(n2>0 && n2<=10){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Validacion3(){
        if(n3>0 && n3<=10){
            return true;
        }else{
            return false;
        }
    }
    

    @Override
    public String toString() {
        return "Nombre : " + nombre + "\n"+
                "Cedula : " + cedula + "\n"+
                "Nota 1 : " + n1 + "\n"+
                "Nota 2 : " + n2 + "\n"+
                "Nota 3 : " + n3;
    }
}
