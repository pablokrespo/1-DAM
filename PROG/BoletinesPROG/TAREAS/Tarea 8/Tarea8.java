package tarea8;
import java.util.Scanner;
public class Tarea8 {
    public static void main(String[] args) {
        Integer[][] array1 = {{5, 2, 9, 6}, {7, 2, 1, 4}};

        System.out.println("Valor mínimo: " + Operaciones.valorMinimo(array1));
        System.out.println("Valor máximo: " + Operaciones.valorMaximo(array1));

        System.out.print("Introduzca un valor a buscar: ");
        Integer valor= new Scanner(System.in).nextInt();
        Operaciones.buscarValor(array1, valor);

        System.out.print("Introduzca un valor a eliminar: ");
        valor= new Scanner(System.in).nextInt();
        Operaciones.borrarValor(array1, valor);
        //Conmprobamos se o valor eliminouse do array
        Operaciones.buscarValor(array1, valor);
    }  
}
