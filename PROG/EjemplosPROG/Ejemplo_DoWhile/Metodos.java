package ejemplodowhile;
import java.util.Scanner;
public class Metodos {
    private int numero;
    Scanner sc=new Scanner(System.in);
public int pedirDatos(){
        System.out.println("Teclea número: ");
        numero= sc.nextInt();
        return numero;
    }
public void verDoWhile(){
    int contador= 0;
    int acumulador= 0;    
    do {
        numero= pedirDatos();
        contador= contador +1;
            if(numero %2 == 0) {
            System.out.println(numero);
            acumulador= acumulador + numero;
            }
    } while (contador < 5);
        System.out.println("La suma de los números pares con DOWHILE es: " + acumulador);
}
public void sumarParesFor(){
//    int contador ;
    int acumulador= 0;
    for(int contador=0, i= 10; contador <= 5 &&numero%2==0; contador++) {
        numero= pedirDatos();
        if(numero%2 == 0){
            acumulador= acumulador + numero; 
        }
    }
    System.out.println("La suma de los numeros pares con FOR es: "+ acumulador);
}}
