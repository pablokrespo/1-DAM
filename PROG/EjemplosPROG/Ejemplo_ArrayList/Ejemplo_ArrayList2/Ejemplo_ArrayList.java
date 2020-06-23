package ejemplo_arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class Ejemplo_ArrayList {
public static void main(String[] args) {
    Metodos objeto= new Metodos();
    ArrayList <Integer> listaNumeros= new ArrayList <Integer>();
//Añadimos elementos
    listaNumeros.add(1);
    listaNumeros.add(2);
    listaNumeros.add(2);
    listaNumeros.add(5);
    objeto.enseñar(listaNumeros);
//Cambiamos un elemento
    listaNumeros.set(2, 3);
    objeto.enseñar(listaNumeros);
//Eliminar un elemento por su posición
    listaNumeros.remove(2);
    objeto.enseñar(listaNumeros);
//Eliminar un elemento por su valor
    listaNumeros.remove(new Integer(5));
    objeto.enseñar(listaNumeros);
//Añadir elementos
    listaNumeros.add(3);
    listaNumeros.add(2);
    listaNumeros.add(5);
    listaNumeros.add(4);
//Cambiar el 5 por el 7 sin saber la posición
    int posicion= listaNumeros.indexOf(new Integer(5));
    listaNumeros.set(posicion, 7);
    objeto.enseñar(listaNumeros);
//Ordenar los elementos
    Collections.sort(listaNumeros);
    } 
}