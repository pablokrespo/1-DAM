package boletin21;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Boletin21 {
public static void main(String[] args) {
    ArrayList<Libro> listaLibros = new ArrayList();
    File f= new File("libros.txt");
    Metodos objeto= new Metodos();
    int opcion;
    do{
    opcion= Integer.parseInt(JOptionPane.showInputDialog("***** MENÚ *****"
            + "\n1--> Añadir libro"
            + "\n2--> Consultar precio"
            + "\n3--> Enseñar"+ ""
            + "\n4--> Dar de baja los libros con 0 unidades"
            + "\n5--> Cambiar precio"
            + "\n6--> Salir"));    
    switch(opcion){
        case 1: objeto.añadirLibro("libros.txt");
        break;
        case 2: objeto.consultarPrecio(f);
        break;
        case 3: objeto.visualizarLibro(f);
        break;
        case 4: objeto.dardeBaja(listaLibros, f);
                objeto.escribirListaActualizada("libros.txt",listaLibros);
        break;
        case 5: objeto.modificarPrecio(listaLibros);
                objeto.escribirListaActualizada("libros.txt", listaLibros);
        break;
        case 6: objeto.salir();
    }
    }while (opcion<6);
} 
}
