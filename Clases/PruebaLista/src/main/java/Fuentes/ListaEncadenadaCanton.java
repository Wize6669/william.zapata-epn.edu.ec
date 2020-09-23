package Fuentes;

public class ListaEncadenadaCanton {
    NodoCanton inicioCanton;

    public ListaEncadenadaCanton() {
        this.inicioCanton = null;
    }
    
    public boolean estaVacio() {
        return inicioCanton == null;
    }
    
    public void addInicio(Canton ciudad) {
        if(estaVacio()) {
            inicioCanton = new NodoCanton(ciudad);
        }else {
            inicioCanton = new NodoCanton(ciudad, inicioCanton);
        }
    }
    
    public void addFinal(Canton ciudad) {
        if(estaVacio()) {
            inicioCanton = new NodoCanton(ciudad);
        }else {
        
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
