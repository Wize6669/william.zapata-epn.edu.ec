package Fuentes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ManejoStrings {
    private String entrada;
    ArrayList<String> lista;
    public ManejoStrings(){
        lista=new ArrayList<>();    
    }

    public void setStrig(String stringEntrada) {
        entrada = stringEntrada;
    }
    public ArrayList tokenizarString(){
        StringTokenizer tokens = new StringTokenizer(this.entrada,",");
        for(int i=0; tokens.hasMoreTokens();i++){
            lista.add(tokens.nextToken());
        }
        return lista;
    }
    
    public void convertirMayusculaPrimeraLetra(){
        ArrayList <String>listaAux=new ArrayList<String>();
        char[]carateres;
        for(String aux: lista){
            carateres= aux.toCharArray();
            carateres[0]=Character.toUpperCase(carateres[0]);
            listaAux.add(String.copyValueOf(carateres));
        }
        lista=listaAux;
    }
    public void ordenarArrays(){
        Collections.sort(lista);
    }
    public void convertirMayusculaPrimeraApellido(){
        ArrayList <String>listaAuxi=new ArrayList<String>();
        char[]caracteres;
        for(String aux: lista){
            caracteres= aux.toCharArray();
            caracteres[0]=Character.toUpperCase(caracteres[0]);
            int indiceEspacio=aux.indexOf(' ');
            caracteres[indiceEspacio+1]=Character.toUpperCase(caracteres[indiceEspacio+1]);
            listaAuxi.add(String.copyValueOf(caracteres));
           
        }
        lista=listaAuxi;
    }

    @Override
    public String toString() {
        String salida="";
        for(String aux: lista)
            salida+= aux+" ";
        return salida;
    }    
}
