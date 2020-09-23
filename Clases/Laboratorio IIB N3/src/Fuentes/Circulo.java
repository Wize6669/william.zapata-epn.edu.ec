package Fuentes;

import java.awt.Graphics;
public class Circulo extends Punto {
    private double radio;
    
    public Circulo(double radio, double x , double y){
        super(x, y);
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return Math.PI * 2 * getRadio();
    }

    @Override
    public double getVolumen() {
        return super.getVolumen();
    }

    @Override
    public void Dibujar(Graphics g) {
        g.drawOval((int)super.getx(), (int)(super.gety()), (int)(10*radio), (int)(10*radio)); 
    }
    
    @Override
    public String toString() {
        return "CIRCULO \n" + super.toString() + "\n Radio: " + this.getRadio()
                + "\nPerimetro:"+getPerimetro()+"m\nArea: "+getArea()+"m^2";
    }
}


