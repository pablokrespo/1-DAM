package nuevoPaquete;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
public class Metodos {
    public Libro crearLibro(){
        Libro libro=new Libro(JOptionPane.showInputDialog("Titulo: "),JOptionPane.showInputDialog("Autor: "),
        JOptionPane.showInputDialog("ISBN: "),Float.parseFloat(JOptionPane.showInputDialog("Precio: ")),
        Integer.parseInt(JOptionPane.showInputDialog("Número Unidades: ")));
            System.out.println("Libro engadido");
        return libro;    
    }
    public void Enseñar(ArrayList<Libro> lista){
        if(lista.isEmpty()){
        throw new NullPointerException("Error. El ArrayList está vacío");
        }
        else{    
        Collections.sort(lista);    
            System.out.println("Enseñar:");
            Iterator it= lista.iterator();
            while(it.hasNext()){
               System.out.println(it.next());
            }
        }
    }
    public void venderLibros(ArrayList<Libro> lista){
        if(lista.isEmpty()){
        throw new NullPointerException("Error. El ArrayList está vacío");
        }
        else{    
            String codigoLibro=JOptionPane.showInputDialog("Introduce el ISBN del libro vendido: ");
            int unidades=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de unidades vendidas: "));
            for (int i= 0; i<lista.size(); i++) {
                if(codigoLibro.equals(lista.get(i).ISBN)){
                    if(unidades<=lista.get(i).numeroUnidades){
                        lista.get(i).numeroUnidades=(lista.get(i).numeroUnidades-unidades);
                    }
                else
                System.out.println("Error, el número de libros vendidos no puede superar el número de unidades disponibles");
                }        
            }
        }
    }
    public void dardeBaja(ArrayList<Libro> lista){
        if(lista.isEmpty()){
        throw new NullPointerException("Error. El ArrayList está vacío");
        }
        else{    
            int contador= 0;
            for (int j= 0; j<lista.size(); j++) {
                if(lista.get(j).numeroUnidades== 0)
                contador++;    
            }
            for (int k= 0; k<contador; k++) {
                for (int i= 0; i<lista.size(); i++) {
                    if (lista.get(i).numeroUnidades== 0){
                        lista.remove(lista.get(i));
                        System.out.println("Libro dado de baja.");
                    }
                }    
            }
        }
    }
    public void consultarLibro(ArrayList<Libro> lista){
        if(lista.isEmpty()){
        throw new NullPointerException("Error. El ArrayList está vacío");
        }
        else{    
            int opcion= Integer.parseInt(JOptionPane.showInputDialog("Como quieres buscar el libro?"
                + "\n1--> Por titulo"
                + "\n2--> Por autor"
                + "\n3--> Por ISBN"));
            switch(opcion){
                case 1:
                    String tit= JOptionPane.showInputDialog("Introduce el título del libro: ");
                    for (int i= 0; i<lista.size(); i++) {
                        if (lista.get(i).titulo.equals(tit))
                        System.out.println("El libro buscado es:\n"+lista.get(i));    
                    }
                    System.out.println(" ");
                    break;    
                case 2:
                    String autor= JOptionPane.showInputDialog("Introduce el autor del libro: ");
                    for (int i= 0; i<lista.size(); i++) {
                        if (lista.get(i).autor.equals(autor))
                        System.out.println("El libro buscado es:\n"+lista.get(i));    
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    String isbn= JOptionPane.showInputDialog("Introduce el ISBN del libro: ");
                    for (int i= 0; i<lista.size(); i++) {
                        if (lista.get(i).ISBN.equals(isbn))
                        System.out.println("El libro buscado es:\n"+lista.get(i));    
                    }
                    System.out.println(" ");
                    break;
            }
        }
    }
    public void salir(){
        System.exit(0);    
    }
}
