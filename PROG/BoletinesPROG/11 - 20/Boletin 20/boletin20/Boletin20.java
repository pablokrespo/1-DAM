package boletin20;
import nuevoPaquete.Metodos;
import nuevoPaquete.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Boletin20 {
public static void main(String[] args) {
    ArrayList<Libro>listaLibros=new ArrayList();
    Libro libro1= new Libro ("aaaaa","a1","01",9.99f,21);
        listaLibros.add(libro1);
    Libro libro2= new Libro ("bbbbb","b2","02",5.99f,18);
        listaLibros.add(libro2);
    Libro libro3= new Libro ("ccccc","c3","03",7.35f,13);
        listaLibros.add(libro3);
    int opcion;
        Metodos objeto= new Metodos();
    do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENÚ *****  "
                + "\n1--> Añadir libro"
                + "\n2--> Enseñar"
                + "\n3--> Vender libros"
                + "\n4--> Darr de baja los libros con 0 unidades"
                + "\n5--> Consultar un libro"
                + "\n6--> Saír"));    
        switch(opcion){
            case 1: listaLibros.add(objeto.crearLibro());
            break;
            case 2: objeto.Enseñar(listaLibros);
            break;
            case 3: objeto.venderLibros(listaLibros);
            break;
            case 4: objeto.dardeBaja(listaLibros);
            break;
            case 5: objeto.consultarLibro(listaLibros);
            break;
            case 6: objeto.salir();
        }
    }while (opcion<6);
} 
}
