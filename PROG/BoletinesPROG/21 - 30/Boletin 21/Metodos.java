package boletin21;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Metodos {
    PrintWriter pw= null;
    FileWriter fw;
    Scanner sc;

    public Libro pedirDatos(){
        Libro lib = new Libro(JOptionPane.showInputDialog("Introduce el titulo del libro: "),JOptionPane.showInputDialog("Introduce el autor del libro: "),
        Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del libro: ")),
        Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de unidades a comprar: ")));
        return lib;
    }
    public void enseñar(ArrayList<Libro> lista){
        System.out.println("Enseñar: ");
        Iterator it= lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
       }
    }
    public void añadirLibro(String nombreFich){
        try {
            Libro libro= pedirDatos();     
            fw= new FileWriter(nombreFich,true);
            pw= new PrintWriter(fw);    
            pw.println(libro.toString());    
        } catch (IOException ex) {
            System.out.println("Error al escribir números"+ex.toString());
        }
        finally{
            pw.close();
        }   
    }
    public String pedirConsulta(){
        String titulo = JOptionPane.showInputDialog("Introduce el título: ");
        return titulo;
    }
    public void consultarPrecio(File fich){
        try {
            String titulo= pedirConsulta();
            sc= new Scanner(fich).useDelimiter(",\\s*");    
            while(sc.hasNext()){
                if (titulo.equals(sc.next())){
                    String autor= sc.next();                 
                    float precio= Float.parseFloat(sc.next());
                    System.out.println("Precio: "+precio);    
                }
                else if (sc.hasNext())
                sc.nextLine();
            }  
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer palabra"+ex.toString());
        }
        finally{
            sc.close();
        }
    }
    public void visualizarLibro(File fich){
        try {
            System.out.println("El archivo contiene: ");
            sc= new Scanner(fich);
            while(sc.hasNextLine()){
              System.out.println(sc.nextLine());    
            }
        }catch (FileNotFoundException ex) {
                System.out.println("Error al leer lineas"+ex.toString());    
        }
        finally{
        sc.close();
        }
    }
    public void dardeBaja(ArrayList<Libro> lista,File fich){
        try {       
            sc = new Scanner(fich).useDelimiter(",\\s*");
            while(sc.hasNextLine()){
                String titulo= sc.next();
                String autor= sc.next();
                float precio= Float.parseFloat(sc.next());
                int unidades= Integer.parseInt(sc.next());
                sc.nextLine();
                Libro libro= new Libro(titulo, autor, precio, unidades);
                lista.add(libro);
            }
            int contador= 0;
            for (int j= 0; j< lista.size(); j++) {
                if(lista.get(j).unidades== 0)
                contador++;    
            }
            for (int k= 0; k< contador; k++) {
                for (int i= 0; i<lista.size(); i++) {
                    if (lista.get(i).unidades==0){
                        lista.remove(lista.get(i));
                        System.out.println("Libro ha sido dado de baija.");
                    }
                }    
            }
        }catch (FileNotFoundException ex) {
            System.out.println("Error al leer lineas"+ex.toString());    
        }   
        finally{
        sc.close();
        }
    }
    public void escribirListaActualizada(String nombreFich,ArrayList<Libro> lista){
        try {
            fw= new FileWriter(nombreFich);
            pw= new PrintWriter(fw);
            for (int i= 0; i<lista.size(); i++) {
                pw.println(lista.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Error al escribir Obxectos"+ex.toString());
        }
        finally{
            pw.close();
        }
    }
    public void modificarPrecio(ArrayList<Libro> lista){
        String titulo=pedirConsulta();    
        float nuevoPrecio=Float.parseFloat(JOptionPane.showInputDialog("Introduce el nuevo precio"));
        for (int i= 0; i<lista.size(); i++) {
            Libro libro=lista.get(i);
            String titulo1= libro.getTitulo();
            if(titulo.equals(titulo1)){
            libro.setPrecio(nuevoPrecio);
            }
        }
    }
    public void salir(){
        System.exit(0);
    }
}
