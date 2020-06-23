package ejemplo_arrays;
public class Ejemplo_Arrays {
public static void main(String[] args) {
    Metodos objeto= new Metodos();
    objeto.crearArray();
    objeto.enseñar();
    
//creamos Array
    int valores[]={1, 2, 3, 4, 5};
    objeto.visualizar(valores);
    int[]datos= new int[3];
    datos= objeto.llenarArray(datos);
    objeto.visualizar(datos);
}
}
