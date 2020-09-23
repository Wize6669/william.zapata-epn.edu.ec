package Fuentes;

import java.awt.Graphics;

public class Punto extends Figura {
    
    private double x,y;
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
      public double getx()
    {
        return x;
    }
    public double gety()
    {
        return y;
    }
  
    @Override
    public void Dibujar(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String toString() {
        return "Punto: " + " " + "(" + "x:" + x + " "+ "y: " + y + ")";
    }
}
