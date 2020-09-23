package Fuentes;

public class ListaEncadenadaProvincia {
    NodoProvincia inicioprovincia;
    NodoCanton inicioCanton;

    public ListaEncadenadaProvincia() {
        this.inicioprovincia = null;
    }
    
 public boolean estaVacio() {
     return inicioprovincia==null;
 }

 public void addInicio(Provincia provincia) {
     if(estaVacio()) {
         inicioprovincia = new NodoProvincia(provincia);
     } else {
        inicioprovincia = new NodoProvincia(provincia, inicioCanton, inicioprovincia);
     }
 
 }
 
 public void addFinal(Provincia provincia) {
    if(estaVacio()) {
        inicioprovincia = new NodoProvincia(provincia);
    } else {
            NodoProvincia q,p;
            q=p=this.inicioprovincia;
            while(p != null) {
                q=p;
                p=p.enlace;
            }
            q.enlace = new NodoProvincia(provincia);
    }
 
 }

    @Override
    public String toString() {
        String salida = "";
    if(estaVacio()) {
        return "Lista Vacia !!!";
    } else {
        salida = "\nLista de Provincias es : ";
        NodoProvincia p = inicioprovincia;
        while (p != null) {
            salida += "\n" + p.getDato().toString() + "\n";
            p = p.enlace;
        }
    }
    return  salida;
    }
    


    
}
