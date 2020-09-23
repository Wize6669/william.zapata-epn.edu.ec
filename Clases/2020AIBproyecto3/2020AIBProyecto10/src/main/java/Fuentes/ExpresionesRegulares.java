package Fuentes;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExpresionesRegulares {
    public void ejercicio1(){
        // Comprobar si el String cadena contiene exactamente el patrón (matches) “abc”
        String opcion;
        Pattern pat = Pattern.compile("abc");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("SI es exactamente la cadena abc");
            }else{
                System.out.println("No es exactamente la cadena abc");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
    public void ejercicio2(){
        // Comprobar si el string cadena contiene "abc"
        String opcion;
        Pattern pat = Pattern.compile(".*abc.*");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("En la cadena ingresada SI existe abc");
            }else{
                System.out.println("En la cadena ingresada NO existe abc");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
       public void ejercicio3(){
        // Comprobar si el String cadena empieza por “abc”
        String opcion;
        Pattern pat = Pattern.compile("^abc.*");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("Empieza con abc");
            }else{
                System.out.println("No empieza con es exactamente la cadena abc");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
        public void ejercicio4(){
        // Comprobar si el String cadena empieza por “abc” ó “Abc”
        String opcion;
        Pattern pat = Pattern.compile("^[aA]bc.*");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("Empieza con abc o Abc la cadena");
            }else{
                System.out.println("No empieza con es exactamente la cadena abc o Abc");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
        public void ejercicio5(){
        // Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
        // no permite blancos y numeros
        String opcion;
        Pattern pat = Pattern.compile("[a-zA-Z]{5,10}");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("Si es valido");
            }else{
                System.out.println("No es valido");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
        public void ejercicio6(){
        // Comprobar si el String cadena no empieza por un dígito
        String opcion;
        Pattern pat = Pattern.compile("^[^\\d].*");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("No empieza con un dígito");
            }else{
                System.out.println("Si empieza con un dígito");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
        public void ejercicio7(){
        // Comprobar si el String cadena no acaba con un dígito
        String opcion;
        Pattern pat = Pattern.compile(".*[^\\d]$");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("No termina la cadena con un dijito y SI es valida");
            }else{
                System.out.println("Termina la cadena con un digito por eso NO es valida");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
        public void ejercicio8(){
        // Comprobar si el String cadena solo contienen los caracteres a ó b
        String opcion;
        Pattern pat = Pattern.compile("(a|b)+");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("La cadena SI contiene los caracteres a ó b");
            }else{
                System.out.println("La cadena NO contiene los caracteres a ó b");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
        public void ejercicio9(){
        // Comprobar si el String cadena contiene un 1 y ese 1 no está seguido por un 2
        String opcion;
        Pattern pat = Pattern.compile(".*1(?!2).*");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("En la cadena existe 1 y NO está seguido por un 2 por ende SI CUMPLE");
            }else{
                System.out.println("En la cadena existe 1 y SI está seguido por un 2 por ende NO CUMPLE");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
        public void ejercicio10(){
        // Comprobar si el String cadena contiene un 1 y ese 1 no está seguido por un 2
        String opcion;
        Pattern pat = Pattern.compile(".*1(!2).*");
        do{
            System.out.println("Ejercicio1: Ingrese una cadena");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("En la cadena existe 1 y NO está seguido por un 2 por ende SI CUMPLE");
            }else{
                System.out.println("En la cadena existe 1 y SI está seguido por un 2 por ende NO CUMPLE");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
        public void comprobacionCorreo(){
        String opcion;
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        do{
            System.out.println("Ejercicio1: Ingrese un correo");
            Scanner sc = new Scanner(System.in);
            String cadena = sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if(mat.matches()){
                System.out.println("El correo es Valido");
            }else{
                System.out.println("El correo NO es Valido");
            }
            System.out.println("Continua? SI/NO");
            opcion=sc.nextLine();
                  
        }while(opcion.equalsIgnoreCase("SI"));
    }
}
