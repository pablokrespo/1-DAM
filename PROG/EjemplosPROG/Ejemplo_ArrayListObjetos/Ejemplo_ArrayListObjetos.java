package ejemplo_arraylistobjetos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Ejemplo_ArrayListObjetos {
public static void main(String[] args) {
    ArrayList <Jugador> listaJugadores= new ArrayList();
    int opcion;
    ActualizarArrayList objeto= new ActualizarArrayList();
    do{
        opcion= Integer.parseInt(JOptionPane.showInputDialog("******* M  E  N  U ********\n 1--> Crear jugador\n 2--> Enseñar jugador\n 3--> Buscar jugador\n 4--> Dar de baja jugador\n 5--> Ordenar jugador\n\n  Teclea opción");
        switch(opcion){
            case 1: listaJugadores.add(objeto.crearJugador());
            break;
            case 2: objeto.enseñar(listaJugadores);
            break;
            case 3: objeto.buscarElemento(listaJugadores);
            break;
            case 4: objeto.dardeBaja(listaJugadores);
            break;
            case 5: objeto.ordenar(listaJugador);
            break;
        }
    }while (opcion < 5);
} 
}
