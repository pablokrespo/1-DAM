package exemploordenador;
import java.util.Scanner;
public class EjemploOrdenador {
public static void main(String[] args) {
    String tipo;
    String marca;
    float pulgadas;
    int velocidad;
    int memoria;
try (Scanner sc= new Scanner(System.in)) {
        System.out.print("\nIntroduce el tipo de ratón: ");
            tipo= sc.next();
        System.out.print("Introduce a marca da pantalla: ");
            marca= sc.next();
        System.out.print("Introduce sus pulgadas: ");
            pulgadas= sc.nextFloat();
        System.out.print("Introduce la velociadad del CPU: ");
            velocidad= sc.nextInt();
        System.out.print("Introduce su memoria: ");
            memoria= sc.nextInt();
        }

Ordenador ordenador1 = new Ordenador(new Raton(tipo), new Pantalla(marca, pulgadas), new Cpu(velocidad, memoria));
ordenador1.amosar();
    }  
}
