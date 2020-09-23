package Fuentes;
import java.util.StringTokenizer;

public class Fecha {
    private int dia,mes,anio;
    public Fecha(String fecha){
        setFecha(fecha);
    }
    public Fecha(){
    
    }
    public void setFecha(String fecha){
        StringTokenizer tk = new StringTokenizer(fecha,"/");
        this.dia=Integer.parseInt(tk.nextToken());
        this.mes=Integer.parseInt(tk.nextToken());
        this.anio=Integer.parseInt(tk.nextToken());
    }
    public int getDia(){
        return dia;
    }
    public void setDia(){
        this.dia = dia;
    }
    public int getMes(){
        return mes;
    }
    public void setMes(){
        this.mes = mes;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(){
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "dia= "+ dia +", mes= "+mes+", anio= "+ anio+'}';
    }
    
}
