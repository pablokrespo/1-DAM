package boletin6_1;
import java.util.Scanner;
public class Boletin6_1 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número:");
        int numero;
        numero = (int) teclado.nextDouble();
        if(numero>= 0){
    System.out.println(numero + " es un número positivo");
        } else {
    System.out.println(numero + " es un número negativo");
        }
}
}
