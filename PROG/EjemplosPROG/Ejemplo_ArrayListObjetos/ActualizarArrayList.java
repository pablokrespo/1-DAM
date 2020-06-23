package ejemplo_arraylistobjetos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
public class ActualizarArrayList {
    public Jugador crearJugador(){
        Jugador jugador= new Jugador(pedirDatos.pedirString("Nombre: "), pedirDatos.pedirInt("Dorsal: "));
        return jugador;
    }
    public void enseñar(ArrayList <Jugador> lista){
        Iterator iterator= lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void buscarElemento (ArrayList <Jugador> lista) {
        String nombre= JOptionPane.showInputDialog("Nombre del jugador: ");
        for (Jugador x:lista) {
            if (nombre.equals(x.nombre))
                System.out.println(nombre+": tiene el dorsal "+x.dorsal);
        }
    }
    public void dardeBaja (ArrayList <Jugador> lista) {
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Dorsal del jugador: "));
        for (int i= 0; i<lista.size(); i++){
            if (numero== lista.get(i).dorsal)
                lista.remove(lista.get(i));
        }
    }
    public void ordenar (ArrayList <Jugador> lista){
        Collections.sort(lista);
        
    }
}
