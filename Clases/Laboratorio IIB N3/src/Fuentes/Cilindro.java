package Fuentes;

import java.awt.Graphics;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double altura, double radio, double x, double y) {
        super(radio, x, y);
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }
    
    @Override
    public void Dibujar(Graphics g) {
        double Radio = getRadio() * 15;
        double Altura = altura * 15;
        
        g.drawOval( (int)super.getx() , (int)super.gety(), (int)Radio , (int)(Radio/2));
        g.drawOval((int)super.getx(),(int)(super.gety()+Altura),(int) Radio, (int)(Radio/2));
        
        g.drawLine((int)(super.getx()),(int)(super.gety()+Radio/4), (int)(super.getx()), (int)(Altura+Radio/4));
        g.drawLine((int)(super.getx()+(Radio)),(int)(super.gety()+Radio/4), (int)(super.getx()+(Radio)), (int)(Altura+Radio/4));   
    }

    @Override
    public double getVolumen() {
        return super.getArea() * getAltura();
    }

    @Override
    public double getPerimetro() {
        return super.getPerimetro() * getAltura();
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() * super.getPerimetro() * getAltura();
    }

    @Override
    public double getRadio() {
        return super.getRadio();
    }

    @Override
    public String toString() {
        return "CILINDRO \n" + super.toString() + "Altura: " + getAltura() + "\n Volumen:" 
                + getVolumen() +"m^3" + "\n Perímetro: " + getPerimetro();
    } 
}
