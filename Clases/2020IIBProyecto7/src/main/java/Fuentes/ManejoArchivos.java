package Fuentes;
import Interfaces.JFEmpleadosListaEnlazada;
import java.awt.Desktop;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {

    public boolean searchEditorial(String NombreArchivo) {

        Scanner sc = new Scanner(System.in);
        String respuesta;

        try {
            do {
                BufferedReader br = new BufferedReader(new FileReader(NombreArchivo));
                System.out.println("Search Editorial ");
                respuesta = "Editorial: " + sc.nextLine();

                String linea = "";
                boolean encontrado = false;
                while ((linea = br.readLine()) != null) {

                    if (linea.equalsIgnoreCase(respuesta)) {
                        System.out.println(linea);

                        for (int i = 0; i < 2; i++) {
                            System.out.println(br.readLine());
                        }
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Dont Exist");
                }

                System.out.println("Search other file (yes/no)");
                respuesta = sc.nextLine();

            } while (respuesta.equalsIgnoreCase("si"));
        } catch (IOException e) {

            System.out.println("Error");
        }
        return false;
    }

    public boolean searchYear(String fileName) {

        Scanner sc = new Scanner(System.in);
        String respuesta;

        try {
            do {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                System.out.println("Search year ");
                respuesta = "Year: " + sc.nextLine();

                String linea = "";
                boolean encontrado = false;
                while ((linea = br.readLine()) != null) {

                    if (linea.equalsIgnoreCase(respuesta)) {
                        System.out.println(linea);

                        for (int i = 0; i < 2; i++) {
                            System.out.println(br.readLine());
                        }
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Dont Exist");
                }

                System.out.println("Search other file (yes/no)");
                respuesta = sc.nextLine();

            } while (respuesta.equalsIgnoreCase("yes"));
        } catch (IOException e) {

            System.out.println("Error");
        }
        return false;
    }

    public boolean removeFile(String NombreArchivo) { // borra todo el txt

        try {
            File fichero = new File(NombreArchivo);
            if (fichero.delete()) {
                System.out.println("Erase archive");
            } else {
                System.out.println("Error");
            }

        } catch (Exception e) {
            System.err.println("Error---->" + e.getMessage());
        }
        return false;
    }

    public boolean AbirirArchivo(String NombreArchivo) {
        try {
            File objetofile = new File(NombreArchivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {
            System.out.println(ex);
        }

        return true;
    }

    public boolean crearArchivo(String nombreArchivo) {
        File archivetxt;

        try {
            System.out.println("Archivo Creado" + nombreArchivo);

            archivetxt = new File(nombreArchivo);

            if (!archivetxt.exists()) {
                try {
                    archivetxt.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(JFEmpleadosListaEnlazada.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("Archive ---->" + nombreArchivo + "<---- Creado Archivo");
            }

            return true;

        } catch (Exception ex) {
            System.out.println("Error Operación Fallida");

            return false;
        }
    }

    public boolean EscribirArchivo(String data, String nombreArchivo) { // dato -> necesita el constructor con parametros
        File archivetxt;
        FileWriter write;
        PrintWriter line;

        try {
            System.out.println("saving" + data + "into " + nombreArchivo);

            archivetxt = new File(nombreArchivo);

            if (!archivetxt.exists()) {
                try {
                    write = new FileWriter(archivetxt, true);
                    line = new PrintWriter(write);
                    line.println(data);
                    line.close();
                    write.close();
                } catch (IOException ex) {
                    Logger.getLogger(JFEmpleadosListaEnlazada.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                try {
                    write = new FileWriter(archivetxt, true);
                    line = new PrintWriter(write);
                    line.println(data);
                    line.close();
                    write.close();
                } catch (IOException ex) {
                    Logger.getLogger(JFEmpleadosListaEnlazada.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            return true;
        } catch (Exception ex) {
            System.out.println("Writing a string infile a fail");
            return false;
        }
    }

    public String read(String NombreArchivo) {
        try {
            String data = "";
            System.out.println("reading from File " + NombreArchivo);
            String cadena;
            FileReader f = new FileReader(NombreArchivo);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                System.out.println(cadena);
            }
            b.close();
            data = "Lucy,white,2,false";
            return data;

        } catch (Exception ex) {
            System.out.println("Reading file " + NombreArchivo + " Failed :( ");
            return "";
        }
    }
}
