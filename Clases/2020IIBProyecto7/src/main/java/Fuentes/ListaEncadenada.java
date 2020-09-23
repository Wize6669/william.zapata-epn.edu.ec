package Fuentes;

import javax.swing.JOptionPane;

public class ListaEncadenada {
    Nodo inicio;

    public ListaEncadenada() {
        this.inicio = null;
    }
    
    public boolean estaVacia() {
        return (inicio == null);
    }
    
    public void addInicio(Empleado empleado) {
        if(estaVacia())
            inicio = new Nodo(empleado);
        else
            inicio = new Nodo(empleado, inicio);
    }
    
    public void addFinal(Empleado empleado) {
        if(estaVacia()) { 
            inicio = new Nodo(empleado);
        }else {
            Nodo q,p;
            q=p=this.inicio;
            while(p != null) {
                q=p;
                p=p.enlace;
            }
            q.enlace = new Nodo(empleado);
        }
    }
    
    public void addOrden(Empleado empleado) {
        if(estaVacia()) {
            inicio = new Nodo(empleado);
        }else{
            Nodo q,p,r;
            q=p=this.inicio;
            r = new Nodo(empleado);
            while(p != null) {
                if((empleado.getNombre().compareTo(p.getDato().getNombre()) < 0)) {
                    if( p == inicio) {
                        r.enlace=inicio;
                        inicio=r;
                    }
                    else {
                        r.enlace = p.enlace;
                        p.enlace = r;
                    }
                    break;  
                }
                else {
                    q=p;
                    p=p.enlace;
                }      
            }
            if(p == null){
                q.enlace = r;
            }
        }
    }
    
    public String eliminarNodo(Empleado empleado) {
        boolean bandera = false;
        String salida= "";
        if(estaVacia()) {
            JOptionPane.showMessageDialog(null,"La lista esta VACIA !!!");
        }else {
            Nodo q,p;
            q = p = this.inicio;
            while(p != null) {
                if((empleado.getNombre().compareToIgnoreCase(p.getDato().getNombre())) ==0) {
                    if(p == inicio) {
                        inicio = p.enlace;
                    }else {
                        q.enlace = p.enlace;
                    }
                    bandera = true;
                    break;
                }else {
                    q = p;
                    p = p.enlace;
                }
            }
        }
        if(bandera == true) {
            salida="Registro ELIMINADO";
        }else {
            salida="No EXISTE el registro";
        }
        return salida;
    }


    @Override
    public String toString() {
        String salida = " ";
        if(estaVacia())
            return "Lista VACIA !!!";
        else
            salida= "La lista de Empleados es: ";
            Nodo p=inicio;
            while(p!=null) {
                salida+="\n\n" + p.getDato().toString();
                p = p.enlace;
            }
    return salida;
    }  
}
