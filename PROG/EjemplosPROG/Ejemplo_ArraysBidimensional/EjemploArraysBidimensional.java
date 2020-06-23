package ejemploarraysbidimensional;
import javax.swing.JOptionPane;
public class EjemploArraysBidimensional {
public static void main(String[] args) {
    int[][] matriz= new int[3][4];
    int opcion;
    MetodosArraysBidimensional objeto= new MetodosArraysBidimensional
    do{
        opcion= Integer.parseInt(JOptionPane.showInputDialog("******* M  E  N  U ********\n 1--> Crear Matriz\n 2--> Enseñar\n 3--> Salir\n  Teclea opción");
        switch(opcion){
            case 1: objeto.crearMatriz(matriz);
            break;
            case 2: objeto.enseñar(matriz);
            break;
            case 3: objeto.salir();
        }
    }while(opcion<3);
    }
}
