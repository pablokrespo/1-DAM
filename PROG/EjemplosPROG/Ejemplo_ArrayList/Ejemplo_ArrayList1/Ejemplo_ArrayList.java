package ejemplo_arraylist;
import java.util.ArrayList;
public class Ejemplo_ArrayList {
public static void main(String[] args) {
    ArrayList lista= new ArrayList();
//Añadimos elementos
    lista.add("Mensaje:");
    lista.add(4);
    lista.add(2.3);
    lista.add(new Integer(5));
    
    for (int i=0; i<lista.size(); i++)
    System.out.println(lista.get(i));
    } 
}
