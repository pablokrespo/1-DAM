package ejemplo_arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class Metodos {
//Diferentes formas de recorrer una colección
    public void enseñar(ArrayList <Integer> lista){
        for(int i= 0; i<lista.size(); i++);
            System.out.println(lista.get(i));
    }
    public void enseñarForEach(ArrayList <Integer> lista){
        for(Integer elemento:lista)
            System.out.println(elemento);
    }
//Utilizando iteradores
    public void enseñarIteradores(ArrayList <Integer> lista){
        Iterator iterator= lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        //Tambien
        /*  int valor=(Integer)iterator.next();
              System.out.println(valor);
        */
        }
    }
    public void ver(ArrayList <Integer> lista){
        System.out.println(lista);
    }
}
